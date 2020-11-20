package jdbc.tx;

import com.mycompany.springbasic1102.jdbc.tx.dao.BookDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tx1 {
    @Test
    public void t1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
        BookDao bookDao = ctx.getBean("bookDaoImpl", BookDao.class);
        System.out.println(bookDao);
        // wid = 1 顧客的錢包編號
        int wid = 1;
        // bid = 1 書籍的編號
        int bid = 1;
        //  查詢書籍價格
        int price = bookDao.getPrice(bid);
        // 進行交易
        System.out.println("交易開始");
//        bookDao.updateStock(bid);
//        bookDao.updateWallet(wid, price);
//        System.out.println("交易完成");
    }
}
