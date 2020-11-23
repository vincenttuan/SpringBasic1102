package com.mycompany.springbasic1102.jdbc.homework.entity;

public class Advert {
    private Integer id;
    private String text;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Advert{" + "id=" + id + ", text=" + text + '}';
    }
    
}
