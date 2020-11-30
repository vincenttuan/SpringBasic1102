package com.mycompany.springbasic1102.jpa.entities.one2many;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String bname;
    @Column
    private Integer price;
    @Column
    private Date ct;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getCt() {
        return ct;
    }

    public void setCt(Date ct) {
        this.ct = ct;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", bname=" + bname + ", price=" + price + ", ct=" + ct + '}';
    }
    
    
}
