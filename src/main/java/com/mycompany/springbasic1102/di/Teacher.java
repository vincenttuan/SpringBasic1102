package com.mycompany.springbasic1102.di;

import java.util.List;

public class Teacher {
    private String name;
    private List<String> cls; // 班級
    
    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCls() {
        return cls;
    }

    public void setCls(List<String> cls) {
        this.cls = cls;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name=" + name + ", cls=" + cls + '}';
    }

    
    
}
