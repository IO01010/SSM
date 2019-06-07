package com.abc.graduationproject.bean;

public class graduattionProject {
    private Integer taskid;

    private String applicantname;

    private Boolean applicantstatus;

    private Boolean isaddgroup;

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public String getApplicantname() {
        return applicantname;
    }

    public void setApplicantname(String applicantname) {
        this.applicantname = applicantname == null ? null : applicantname.trim();
    }

    public Boolean getApplicantstatus() {
        return applicantstatus;
    }

    public void setApplicantstatus(Boolean applicantstatus) {
        this.applicantstatus = applicantstatus;
    }

    public Boolean getIsaddgroup() {
        return isaddgroup;
    }

    public void setIsaddgroup(Boolean isaddgroup) {
        this.isaddgroup = isaddgroup;
    }
}