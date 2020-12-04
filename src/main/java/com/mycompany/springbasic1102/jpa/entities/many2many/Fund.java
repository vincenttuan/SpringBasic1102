package com.mycompany.springbasic1102.jpa.entities.many2many;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Fund")
public class Fund {
    @Id
    @GeneratedValue
    private Integer id;
    
    @Column
    private String name;
    
    @JoinTable(
            name = "Fund_Cstock",
            joinColumns = {@JoinColumn(name = "fund_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "cstock_id", referencedColumnName = "id")}
    )
    @ManyToMany
    private Set<Cstock> cstocks = new LinkedHashSet<>();
    
}
