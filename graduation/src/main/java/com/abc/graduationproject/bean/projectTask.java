package com.abc.graduationproject.bean;

public class projectTask {
    private Integer taskid;

    private Integer toprojectid;

    private String taskintroduce;

    private Integer peoplenumber;

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public Integer getToprojectid() {
        return toprojectid;
    }

    public void setToprojectid(Integer toprojectid) {
        this.toprojectid = toprojectid;
    }

    public String getTaskintroduce() {
        return taskintroduce;
    }

    public void setTaskintroduce(String taskintroduce) {
        this.taskintroduce = taskintroduce == null ? null : taskintroduce.trim();
    }

    public Integer getPeoplenumber() {
        return peoplenumber;
    }

    public void setPeoplenumber(Integer peoplenumber) {
        this.peoplenumber = peoplenumber;
    }
}