package com.CELPIPMockTest.CELPIPMockTestBackend;

import com.CELPIPMockTest.CELPIPMockTestBackend.reading.ReadingArticles;
import com.CELPIPMockTest.CELPIPMockTestBackend.reading.ReadingArticlesMapper;
import com.CELPIPMockTest.CELPIPMockTestBackend.utils.MybatisUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@CrossOrigin
public class CELPIPMockTestBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CELPIPMockTestBackendApplication.class, args);
	}


	@GetMapping("/{id}")
	public String hello(@PathVariable Integer id) throws JsonProcessingException {
		System.out.println("called URL /" + id.toString());
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		ReadingArticlesMapper readingArticlesMapper = sqlSession.getMapper(ReadingArticlesMapper.class);
		ReadingArticles readingArticle = readingArticlesMapper.getReadingArticleById(id);
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(readingArticle);
	}

}
