package com.CELPIPMockTest.Core.auth;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {

    //todo: change to interface
    @Autowired
    private LoginServiceImpl loginService;

    //todo: change to POST
    @GetMapping("/user/login")
    public String login(@RequestBody User user) throws JsonProcessingException {

        String token = loginService.login(user);
        Map<String, String> response = Map.of("token", token);

        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(response);
    }

    @GetMapping("/authenticated")
    public String authenticated() {
        return "you are authenticated";
    }
}
