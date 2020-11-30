package jpa.many2one;

import com.mycompany.springbasic1102.jpa.entities.many2one.Customer;
import com.mycompany.springbasic1102.jpa.entities.many2one.Orders;
import jpa.JPATemplate;
import org.junit.Test;

public class Update extends JPATemplate {
    @Test
    public void t1() {
        // 透過游離物件來 Update
        /*
        Orders orders = new Orders();
        orders.setId(1);
        orders.setOrderName("Airplane");
        orders.setCustomer((Customer)session.get(Customer.class, 1));
        session.update(orders);
        */
        // 透過永續物件來 Update
        Orders orders = (Orders)session.get(Orders.class, 1);
        orders.setOrderName("Airplane");
        
        System.out.println("修改完成");
    }
}
