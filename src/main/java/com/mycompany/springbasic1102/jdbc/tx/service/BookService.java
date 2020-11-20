package com.mycompany.springbasic1102.jdbc.tx.service;

public interface BookService {
    void buyOne(Integer wid, Integer bid);
    void buyMany(Integer wid, Integer... bids);
}
