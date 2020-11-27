package jpa.single;

import com.mycompany.springbasic1102.jpa.entities.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    private ClassPathXmlApplicationContext ctx;
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction trans;
    @Before
    public void before() {
        ctx = new ClassPathXmlApplicationContext("jpa-config.xml");
        // 取得連線工廠
        sessionFactory = ctx.getBean("sessionFactory", SessionFactory.class);
        // 取得連線物件
        session = sessionFactory.getCurrentSession();
        // 取得交易管理並開始
        trans = session.beginTransaction();
    }
    @Test
    public void t1() {
        // 進行資料表交易程序 ...
        // CRUD ...
        Customer customer = new Customer();
        customer.setLastName("Mary");
        // 新增 customer 物件資料到 CUSTOMER 資料表中建立一筆紀錄
        session.persist(customer); 
    }
    
    @After
    public void after() {
        trans.commit(); // 提交
        sessionFactory.close(); // 關閉
        ctx.close();
    }
}
