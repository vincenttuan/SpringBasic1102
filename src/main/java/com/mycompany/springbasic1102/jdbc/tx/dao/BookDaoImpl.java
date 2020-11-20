package com.mycompany.springbasic1102.jdbc.tx.dao;

import com.mycompany.springbasic1102.jdbc.tx.exception.InsufficientAmount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public Integer getPrice(Integer bid) {
        String sql = "Select price From Book Where bid = ?";
        Integer price = jdbcTemplate.queryForObject(sql, Integer.class, bid);
        return price;
    }

    @Override
    public void updateStock(Integer bid) {
        String sql = "Update Stock set amount = amount - 1 Where bid = ?";
        jdbcTemplate.update(sql, bid);
    }

    @Override
    public void updateWallet(Integer wid, Integer money) throws InsufficientAmount {
        // 先判斷 Wallet 的 money 是否足夠 ?
        String sql = "Select money From Wallet Where wid = ?";
        int walletMoney = jdbcTemplate.queryForObject(sql, Integer.class, wid);
        if(walletMoney < money) {
            throw new InsufficientAmount();
        }
        // 進行錢包餘額更新
        sql = "Update Wallet set money = money - ? Where wid = ?";
        jdbcTemplate.update(sql, money, wid);
    }
    
}
