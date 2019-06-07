package com.abc.graduationproject.dao;

import com.abc.graduationproject.bean.memberInf;
import com.abc.graduationproject.bean.memberInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface memberInfMapper {
    long countByExample(memberInfExample example);

    int deleteByExample(memberInfExample example);

    int deleteByPrimaryKey(String infname);

    int insert(memberInf record);

    int insertSelective(memberInf record);

    List<memberInf> selectByExample(memberInfExample example);

    memberInf selectByPrimaryKey(String infname);

    int updateByExampleSelective(@Param("record") memberInf record, @Param("example") memberInfExample example);

    int updateByExample(@Param("record") memberInf record, @Param("example") memberInfExample example);

    int updateByPrimaryKeySelective(memberInf record);

    int updateByPrimaryKey(memberInf record);
}