package com.CELPIPMockTest.CELPIPMockTestBackend.reading;

import java.util.List;

public interface ReadingArticlesMapper {
    ReadingArticles getReadingArticleById(int readingArticleUid);
    List<ReadingArticleUid> getReadingArticleUid();
}
