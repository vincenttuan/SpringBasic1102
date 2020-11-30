package jpa.single;

import com.mycompany.springbasic1102.jpa.entities.many2one.Customer;
import jpa.JPATemplate;
import org.junit.Test;

public class Delete extends JPATemplate {
    @Test
    public void t1() {
        //Customer c1 = (Customer)session.get(Customer.class, 4);
        //session.delete(c1);
        
        Customer c2 = new Customer();
        c2.setId(5);
        c2.setLastName("aaa");
        session.delete(c2);
        
    }
}
