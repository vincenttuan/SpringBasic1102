package jdbc.tx;

import com.mycompany.springbasic1102.jdbc.tx.dao.BookDao;
import com.mycompany.springbasic1102.jdbc.tx.exception.InsufficientAmount;
import com.mycompany.springbasic1102.jdbc.tx.service.BookService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tx2 {
    @Test
    public void t2() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
        BookService bookService = ctx.getBean("bookServiceImpl", BookService.class);
        int wid = 1;
        int bid = 1;
        try {
            bookService.buyOne(wid, bid);
        } catch (InsufficientAmount ex) {
            System.out.println("交易失敗~");
            System.out.println(ex);
        }
    }
}
