package com.mycompany.springbasic1102.jpa.entities.many2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Orders")
public class Orders {
    @Id
    @GeneratedValue
    private Integer id;
    
    @Column
    private String orderName;
    
    // 映射單向 n-1 的關聯關係
    @ManyToOne
    // FetchType.LAZY 不預先select加載資料, 等到程式有使用到時才會去 Select
    //@ManyToOne(fetch = FetchType.LAZY)
    // FetchType.EAGER 預先select加載資料
    //@ManyToOne(fetch = FetchType.EAGER)
    // 使用 @JoinColumn 來設定映射外鍵
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
}
