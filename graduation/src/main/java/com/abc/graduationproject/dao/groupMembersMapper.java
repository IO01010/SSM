package com.abc.graduationproject.dao;

import com.abc.graduationproject.bean.groupMembers;
import com.abc.graduationproject.bean.groupMembersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface groupMembersMapper {
    long countByExample(groupMembersExample example);

    int deleteByExample(groupMembersExample example);

    int deleteByPrimaryKey(Integer memberid);

    int insert(groupMembers record);

    int insertSelective(groupMembers record);

    List<groupMembers> selectByExample(groupMembersExample example);

    groupMembers selectByPrimaryKey(Integer memberid);

    int updateByExampleSelective(@Param("record") groupMembers record, @Param("example") groupMembersExample example);

    int updateByExample(@Param("record") groupMembers record, @Param("example") groupMembersExample example);

    int updateByPrimaryKeySelective(groupMembers record);

    int updateByPrimaryKey(groupMembers record);
}