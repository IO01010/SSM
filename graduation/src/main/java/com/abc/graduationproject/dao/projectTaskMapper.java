package com.abc.graduationproject.dao;

import com.abc.graduationproject.bean.projectTask;
import com.abc.graduationproject.bean.projectTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface projectTaskMapper {
    long countByExample(projectTaskExample example);

    int deleteByExample(projectTaskExample example);

    int deleteByPrimaryKey(Integer taskid);

    int insert(projectTask record);

    int insertSelective(projectTask record);

    List<projectTask> selectByExample(projectTaskExample example);

    projectTask selectByPrimaryKey(Integer taskid);

    int updateByExampleSelective(@Param("record") projectTask record, @Param("example") projectTaskExample example);

    int updateByExample(@Param("record") projectTask record, @Param("example") projectTaskExample example);

    int updateByPrimaryKeySelective(projectTask record);

    int updateByPrimaryKey(projectTask record);
}