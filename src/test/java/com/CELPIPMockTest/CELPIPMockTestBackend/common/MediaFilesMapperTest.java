package com.CELPIPMockTest.CELPIPMockTestBackend.common;

import com.CELPIPMockTest.CELPIPMockTestBackend.reading.ReadingArticles;
import com.CELPIPMockTest.CELPIPMockTestBackend.reading.ReadingArticlesMapper;
import com.CELPIPMockTest.CELPIPMockTestBackend.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;

public class MediaFilesMapperTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        MediaFilesMapper mediaFilesMapper = sqlSession.getMapper(MediaFilesMapper.class);

        System.out.println(mediaFilesMapper.getMediaFileById(2));

        sqlSession.close();
    }
}

