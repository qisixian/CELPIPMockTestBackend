package com.CELPIPMockTest.CELPIPMockTestBackend.reading;

import com.CELPIPMockTest.CELPIPMockTestBackend.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ReadingArticlesMapperTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ReadingArticlesMapper readingArticlesMapper = sqlSession.getMapper(ReadingArticlesMapper.class);
        ReadingArticles readingArticle = readingArticlesMapper.getReadingArticleById(111);

        System.out.println(readingArticle);

        sqlSession.close();
    }
}
