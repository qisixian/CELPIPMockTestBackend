package com.CELPIPMockTest.Core.reading;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ReadingArticlesMapper {

    ReadingArticles getReadingArticleById(int readingArticleUid);
}
