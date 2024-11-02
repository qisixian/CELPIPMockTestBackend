package com.CELPIPMockTest.CELPIPMockTestBackend.reading;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface ReadingArticlesMapper {

    ReadingArticles getReadingArticleById(int readingArticleUid);
}
