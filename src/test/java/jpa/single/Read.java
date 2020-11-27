package jpa.single;

import com.mycompany.springbasic1102.jpa.entities.Customer;
import java.util.List;
import jpa.JPATemplate;
import org.junit.Test;

public class Read extends JPATemplate {
    @Test
    public void t1() {
        // 查單筆
        Customer customer = (Customer) session.get(Customer.class, 1);
        System.out.println(customer.getId() + ", " + customer.getLastName());
        // 查多筆 1
        List list = session.createSQLQuery("select * from Customer").list();
        list.stream().forEach(System.out::println);
        // 查多筆 2
        List<Customer> list2 = session.createQuery("from Customer").list();
        list2.stream().forEach(System.out::println);
    }
}
