package com.CELPIPMockTest.Core.web;

import com.CELPIPMockTest.Core.common.MediaFiles;
import com.CELPIPMockTest.Core.common.MediaFilesMapper;
import com.CELPIPMockTest.Core.reading.ReadingArticles;
import com.CELPIPMockTest.Core.reading.ReadingArticlesMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@CrossOrigin
public class AllController {

    @Autowired
    MediaFilesMapper mediaFilesMapper;

    @Autowired
    ReadingArticlesMapper readingArticlesMapper;

    @GetMapping("/")
    public String auth( @RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient authorizedClient,
                        @AuthenticationPrincipal OAuth2User oauth2User) throws JsonProcessingException {
        Map<String, Object> map = new HashMap<>();
        map.put("userName", oauth2User.getName());
        map.put("clientName", authorizedClient.getClientRegistration().getClientName());
        map.put("userAttributes", oauth2User.getAttributes());
        System.out.println(map);
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        return mapper.writeValueAsString(map);
    }


    @GetMapping("/article/{id}")
    public String hello(@PathVariable Integer id) throws JsonProcessingException {
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        ReadingArticlesMapper readingArticlesMapper = sqlSession.getMapper(ReadingArticlesMapper.class);
        ReadingArticles readingArticle = readingArticlesMapper.getReadingArticleById(id);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(readingArticle);
    }

    @GetMapping("/media/{id}")
    public byte[] getMediaStream(@PathVariable Integer id) {
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        MediaFilesMapper mediaFilesMapper = sqlSession.getMapper(MediaFilesMapper.class);
        MediaFiles mediaFiles = mediaFilesMapper.getMediaFileById(id);
        return mediaFiles.getData();
    }

}
