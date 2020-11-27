package jpa.single;

import com.mycompany.springbasic1102.jpa.entities.Customer;
import jpa.JPATemplate;
import org.junit.Test;

public class Test1 extends JPATemplate {
    @Test
    public void t1() {
        Customer customer = new Customer();
        customer.setLastName("Tom");
        // 新增 customer 物件資料到 CUSTOMER 資料表中建立一筆紀錄
        session.persist(customer); 
    }
}
