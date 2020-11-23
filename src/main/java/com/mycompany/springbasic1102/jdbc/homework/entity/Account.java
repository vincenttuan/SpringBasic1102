package com.mycompany.springbasic1102.jdbc.homework.entity;

import java.util.Set;

public class Account {
    private Integer id;
    private String name;
    private Budget budget;
    private Set<Advert> adverts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public Set<Advert> getAdverts() {
        return adverts;
    }

    public void setAdverts(Set<Advert> adverts) {
        this.adverts = adverts;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", budget=" + budget + ", adverts=" + adverts + '}';
    }
    
}
