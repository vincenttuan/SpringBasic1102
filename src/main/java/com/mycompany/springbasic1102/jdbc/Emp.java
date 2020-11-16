package com.mycompany.springbasic1102.jdbc;

import java.util.Date;

public class Emp {
    private Integer eid;
    private String ename;
    private Integer age;
    private String sex;
    private Date ct;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getCt() {
        return ct;
    }

    public void setCt(Date ct) {
        this.ct = ct;
    }

    @Override
    public String toString() {
        return "Emp{" + "eid=" + eid + ", ename=" + ename + ", age=" + age + ", sex=" + sex + ", ct=" + ct + '}';
    }
    
}
