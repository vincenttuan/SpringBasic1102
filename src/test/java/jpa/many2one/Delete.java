package jpa.many2one;

import com.mycompany.springbasic1102.jpa.entities.many2one.Customer;
import com.mycompany.springbasic1102.jpa.entities.many2one.Orders;
import jpa.JPATemplate;
import org.junit.Test;

public class Delete extends JPATemplate {
    @Test
    public void t1() {
        // 游離物件刪除 1 的一方
        /*
        Orders o1 = new Orders();
        o1.setId(1);
        session.delete(o1);
        */
        // 透過永續物件來刪除 1 的一方
        /*
        Orders o1 = (Orders)session.get(Orders.class, 2);
        session.delete(o1);
        */
        // 透過永續物件來刪除多的一方 (此多的一方必須沒有 orders)
        Customer c1 = (Customer)session.get(Customer.class, 1);
        session.delete(c1);
        
        System.out.println("刪除成功");
    }
}
