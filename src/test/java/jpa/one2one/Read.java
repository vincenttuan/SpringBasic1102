package jpa.one2one;

import com.mycompany.springbasic1102.jpa.entities.one2one.Boss;
import com.mycompany.springbasic1102.jpa.entities.one2one.Company;
import jpa.JPATemplate;
import org.hibernate.Query;
import org.junit.Test;

public class Read extends JPATemplate{
    @Test
    public void t1() {
        Query query = session.createQuery("From Company c");
        System.out.println(query.list());
        
        for(Object object : query.list()) {
            Company company = (Company)object;
            System.out.printf("%s %s\n", company.getName(), company.getBoss().getName());
        }
    }
}
