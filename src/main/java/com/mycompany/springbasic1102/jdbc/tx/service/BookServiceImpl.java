package com.mycompany.springbasic1102.jdbc.tx.service;

import com.mycompany.springbasic1102.jdbc.tx.dao.BookDao;
import com.mycompany.springbasic1102.jdbc.tx.exception.InsufficientAmount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {
    
    @Autowired
    private BookDao bookDao;
    
    @Transactional(propagation = Propagation.REQUIRED, 
            timeout = 2,
            rollbackFor = {InsufficientAmount.class})
    @Override
    public void buyOne(Integer wid, Integer bid) throws InsufficientAmount {
        int price = bookDao.getPrice(bid);
        System.out.println("BookService 交易開始");
        bookDao.updateStock(bid);
//        try {
//            Thread.sleep(3000);
//        } catch (Exception e) {
//        }
        bookDao.updateWallet(wid, price);
        System.out.println("BookService 交易完成");
    }

    @Override
    public void buyMany(Integer wid, Integer... bids) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
