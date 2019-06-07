package com.abc.graduationproject.bean;

public class groupMembers {
    private Integer memberid;

    private Integer groupid;

    private String membername;

    private Integer membertaskid;

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername == null ? null : membername.trim();
    }

    public Integer getMembertaskid() {
        return membertaskid;
    }

    public void setMembertaskid(Integer membertaskid) {
        this.membertaskid = membertaskid;
    }
}