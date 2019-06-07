package com.abc.graduationproject.bean;

public class Project {
    private Integer projectid;

    private String projectname;

    private String promulgatename;

    private String projectintroduce;

    private Boolean isnotvalid;

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getPromulgatename() {
        return promulgatename;
    }

    public void setPromulgatename(String promulgatename) {
        this.promulgatename = promulgatename == null ? null : promulgatename.trim();
    }

    public String getProjectintroduce() {
        return projectintroduce;
    }

    public void setProjectintroduce(String projectintroduce) {
        this.projectintroduce = projectintroduce == null ? null : projectintroduce.trim();
    }

    public Boolean getIsnotvalid() {
        return isnotvalid;
    }

    public void setIsnotvalid(Boolean isnotvalid) {
        this.isnotvalid = isnotvalid;
    }
}