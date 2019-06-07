package com.abc.graduationproject.bean;

import java.util.Date;

public class taskProcess {
    private Integer membertaskid;

    private String process;

    private Date processdate;

    public Integer getMembertaskid() {
        return membertaskid;
    }

    public void setMembertaskid(Integer membertaskid) {
        this.membertaskid = membertaskid;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process == null ? null : process.trim();
    }

    public Date getProcessdate() {
        return processdate;
    }

    public void setProcessdate(Date processdate) {
        this.processdate = processdate;
    }
}