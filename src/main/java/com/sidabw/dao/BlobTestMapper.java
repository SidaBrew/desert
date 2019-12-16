package com.sidabw.dao;

import com.sidabw.entity.BlobTest;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlobTestMapper {
    int countByExample(BlobTestExample example);

    int deleteByExample(BlobTestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlobTest record);

    int insertSelective(BlobTest record);

    List<BlobTest> selectByExampleWithBLOBs(BlobTestExample example);

    List<BlobTest> selectByExample(BlobTestExample example);

    BlobTest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlobTest record, @Param("example") BlobTestExample example);

    int updateByExampleWithBLOBs(@Param("record") BlobTest record, @Param("example") BlobTestExample example);

    int updateByExample(@Param("record") BlobTest record, @Param("example") BlobTestExample example);

    int updateByPrimaryKeySelective(BlobTest record);

    int updateByPrimaryKeyWithBLOBs(BlobTest record);
}