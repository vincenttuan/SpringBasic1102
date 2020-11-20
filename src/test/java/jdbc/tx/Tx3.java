package jdbc.tx;

import com.mycompany.springbasic1102.jdbc.tx.controller.BookController;
import com.mycompany.springbasic1102.jdbc.tx.dao.BookDao;
import com.mycompany.springbasic1102.jdbc.tx.exception.InsufficientAmount;
import com.mycompany.springbasic1102.jdbc.tx.service.BookService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tx3 {
    @Test
    public void t3() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
        BookController bookController = ctx.getBean("bookControllerImpl", BookController.class);
        int wid = 1;
        int bid = 1;
        bookController.buyBook(wid, bid);
    }
}
