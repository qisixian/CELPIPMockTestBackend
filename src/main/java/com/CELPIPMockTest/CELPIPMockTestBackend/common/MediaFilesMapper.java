package com.CELPIPMockTest.CELPIPMockTestBackend.common;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MediaFilesMapper {

    @Select("SELECT * FROM media_files WHERE id = #{id}")
    MediaFiles getMediaFileById(int id);
}
