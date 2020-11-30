package jpa.many2one;

import com.mycompany.springbasic1102.jpa.entities.many2one.Orders;
import jpa.JPATemplate;
import org.junit.Test;

public class Read extends JPATemplate {
    @Test
    public void t1() {
        Orders orders = (Orders)session.get(Orders.class, 1);
        System.out.println(orders.getOrderName());
        System.out.println(orders.getCustomer().getLastName());
    }
}
