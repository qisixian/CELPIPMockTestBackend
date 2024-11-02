package com.CELPIPMockTest.Core;

import com.CELPIPMockTest.Core.common.MediaFilesMapper;
import com.CELPIPMockTest.Core.reading.ReadingArticles;
import com.CELPIPMockTest.Core.reading.ReadingArticlesMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CELPIPMockTestCoreApplicationTests {


	@Autowired
	ReadingArticlesMapper readingArticlesMapper;

	@Test
	void testReadingArticlesMapper() {

		ReadingArticles readingArticle = readingArticlesMapper.getReadingArticleById(111);

		System.out.println(readingArticle);
	}

	@Autowired
	MediaFilesMapper mediaFilesMapper;

	@Test
	void testMediaFilesMapper() {

		System.out.println(mediaFilesMapper.getMediaFileById(2));

	}

}
