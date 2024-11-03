package com.CELPIPMockTest.Core.config;

import ch.qos.logback.core.util.StringUtil;
import com.CELPIPMockTest.Core.auth.LoginUser;
import com.CELPIPMockTest.Core.auth.User;
import com.CELPIPMockTest.Core.auth.UserMapper;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.Payload;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Objects;

@Component
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

    @Autowired
    private UserMapper userMapper;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String token = request.getHeader("Authorization");
        if (!StringUtils.hasText(token)) { // && token.startsWith("Bearer ")
            filterChain.doFilter(request, response);
            return;
        }
        String userid;
        try {
            Payload payload = JWSObject.parse(token).getPayload();
            userid = payload.toString();
        } catch (ParseException e) {
            throw new RuntimeException("token invalid");
        }
        System.out.println("userid: " + userid);
        User user = userMapper.getUserById(Long.parseLong(userid));
        if (Objects.isNull(user)) {
            throw new RuntimeException("user not found");
        }
        // add user to security context
        // todo: set user roles to authenticationToken
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(new LoginUser(user), null, null);
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);

        filterChain.doFilter(request, response);

    }
}
