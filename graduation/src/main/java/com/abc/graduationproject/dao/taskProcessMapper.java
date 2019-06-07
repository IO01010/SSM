package com.abc.graduationproject.dao;

import com.abc.graduationproject.bean.taskProcess;
import com.abc.graduationproject.bean.taskProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface taskProcessMapper {
    long countByExample(taskProcessExample example);

    int deleteByExample(taskProcessExample example);

    int deleteByPrimaryKey(Integer membertaskid);

    int insert(taskProcess record);

    int insertSelective(taskProcess record);

    List<taskProcess> selectByExample(taskProcessExample example);

    taskProcess selectByPrimaryKey(Integer membertaskid);

    int updateByExampleSelective(@Param("record") taskProcess record, @Param("example") taskProcessExample example);

    int updateByExample(@Param("record") taskProcess record, @Param("example") taskProcessExample example);

    int updateByPrimaryKeySelective(taskProcess record);

    int updateByPrimaryKey(taskProcess record);
}