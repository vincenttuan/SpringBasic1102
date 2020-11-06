package com.mycompany.springbasic1102.di;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teacher {
    private String name;
    private List<String> cls; // 班級
    private Set<Student> students;
    private Map<String, Integer> subjects;
    
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

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Map<String, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(Map<String, Integer> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name=" + name + ", cls=" + cls + ", students=" + students + ", subjects=" + subjects + '}';
    }
    
}
