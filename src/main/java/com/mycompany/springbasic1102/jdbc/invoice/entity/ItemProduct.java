package com.mycompany.springbasic1102.jdbc.invoice.entity;

public class ItemProduct {
    private Integer id;
    private String text;
    private Integer price;
    private Integer inventory;

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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "ItemProduct{" + "id=" + id + ", text=" + text + ", price=" + price + ", inventory=" + inventory + '}';
    }
    
}
