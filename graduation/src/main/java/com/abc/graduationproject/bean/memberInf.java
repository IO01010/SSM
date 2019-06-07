package com.abc.graduationproject.bean;

public class memberInf {
    private String infname;

    private Integer password;

    private String email;

    private Integer telephone;

    private String introduce;

    public String getInfname() {
        return infname;
    }

    public void setInfname(String infname) {
        this.infname = infname == null ? null : infname.trim();
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }
}