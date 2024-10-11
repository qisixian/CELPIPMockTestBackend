package com.CELPIPMockTest.CELPIPMockTestBackend;

import com.CELPIPMockTest.CELPIPMockTestBackend.reading.ReadingArticles;
import com.CELPIPMockTest.CELPIPMockTestBackend.reading.ReadingArticlesMapper;
import com.CELPIPMockTest.CELPIPMockTestBackend.utils.MybatisUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin
public class CELPIPMockTestBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CELPIPMockTestBackendApplication.class, args);
	}


	@GetMapping("/")
	public String hello() throws JsonProcessingException {
		System.out.println("called URL '/'");
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		ReadingArticlesMapper readingArticlesMapper = sqlSession.getMapper(ReadingArticlesMapper.class);
		ReadingArticles readingArticle = readingArticlesMapper.getReadingArticleById(111);
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(readingArticle);
	}

}
