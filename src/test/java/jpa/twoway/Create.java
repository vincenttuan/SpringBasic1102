package jpa.twoway;

import com.mycompany.springbasic1102.jpa.entities.one2many.Book;
import com.mycompany.springbasic1102.jpa.entities.one2many.Bookshelf;
import com.mycompany.springbasic1102.jpa.entities.twoway.Department;
import com.mycompany.springbasic1102.jpa.entities.twoway.Employee;
import java.util.Date;
import jpa.JPATemplate;
import org.junit.Test;

public class Create extends JPATemplate {
    @Test
    public void t1() {
        Department dept = new Department();
        dept.setDname("IT");
        
        Employee e1 = new Employee();
        e1.setEname("John");
        
        Employee e2 = new Employee();
        e2.setEname("Mary");
        
        // 建立關聯關係
        e1.setDepartment(dept);
        e2.setDepartment(dept);
        // 因為在 Department 中有設定 mapby="department" <-- 由 Employee 的 department 來維護
        // 所以下面不用寫
        //dept.getEmployees().add(e1);
        //dept.getEmployees().add(e2);
        // 儲存
        session.persist(dept);
        session.persist(e1);
        session.persist(e2);
        
    }
}
