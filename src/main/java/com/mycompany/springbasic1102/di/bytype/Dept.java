package com.mycompany.springbasic1102.di.bytype;

public class Dept {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dept{" + "name=" + name + '}';
    }
    
}
