package com.mycompany.springbasic1102.jdbc.homework.entity;

public class Budget {
    private Integer id;
    private Integer cash;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Budget{" + "id=" + id + ", cash=" + cash + '}';
    }
    
}
