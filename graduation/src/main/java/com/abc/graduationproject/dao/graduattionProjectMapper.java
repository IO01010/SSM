package com.abc.graduationproject.dao;

import com.abc.graduationproject.bean.graduattionProject;
import com.abc.graduationproject.bean.graduattionProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface graduattionProjectMapper {
    long countByExample(graduattionProjectExample example);

    int deleteByExample(graduattionProjectExample example);

    int insert(graduattionProject record);

    int insertSelective(graduattionProject record);

    List<graduattionProject> selectByExample(graduattionProjectExample example);

    int updateByExampleSelective(@Param("record") graduattionProject record, @Param("example") graduattionProjectExample example);

    int updateByExample(@Param("record") graduattionProject record, @Param("example") graduattionProjectExample example);
}