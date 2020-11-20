package com.mycompany.springbasic1102.jdbc.tx.exception;

//  餘額不足
public class InsufficientAmount extends Exception {

    public InsufficientAmount(String string) {
        super("餘額不足");
    }
    
}
