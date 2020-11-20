package com.mycompany.springbasic1102.jdbc.tx.controller;

public interface BookController {
    void buyBook(Integer wid, Integer bid);
    void buyBooks(Integer wid, Integer... bids);
}
