package com.dao.example2;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchedulerJobMapper {
    int countByExample(SchedulerJobExample example);

    int deleteByExample(SchedulerJobExample example);

    int deleteByPrimaryKey(String userId);

    int insert(SchedulerJob record);

    int insertSelective(SchedulerJob record);

    List<SchedulerJob> selectByExample(SchedulerJobExample example);

    SchedulerJob selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") SchedulerJob record, @Param("example") SchedulerJobExample example);

    int updateByExample(@Param("record") SchedulerJob record, @Param("example") SchedulerJobExample example);

    int updateByPrimaryKeySelective(SchedulerJob record);

    int updateByPrimaryKey(SchedulerJob record);
}