package com.mycompany.springbasic1102.jpa.entities.one2many;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Bookshelf")
public class Bookshelf {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;
    
    @OneToMany
    @JoinColumn(name = "Bookshelf_id")
    private List<Book> books = new ArrayList<>();

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

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Bookshelf{" + "id=" + id + ", name=" + name + ", books=" + books + '}';
    }
    
}
