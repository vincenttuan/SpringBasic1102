package com.mycompany.springbasic1102.jdbc.tx.dao;

import com.mycompany.springbasic1102.jdbc.tx.exception.InsufficientAmount;

public interface BookDao {
    Integer getPrice(Integer bid);
    void updateStock(Integer bid); // 更新庫存
    void updateWallet(Integer wid, Integer money) throws InsufficientAmount; // 更新錢包
}
