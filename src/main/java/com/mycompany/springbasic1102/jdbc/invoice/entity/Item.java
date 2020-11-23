package com.mycompany.springbasic1102.jdbc.invoice.entity;

public class Item {
    private Integer id;
    private Integer amount;
    private ItemProduct product; // ipid 所指向的 Entity
    private Invoice invoice; // invid 所指向的 Entity

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public ItemProduct getProduct() {
        return product;
    }

    public void setProduct(ItemProduct product) {
        this.product = product;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", amount=" + amount + ", product=" + product + ", invoice=" + invoice + '}';
    }
    
}
