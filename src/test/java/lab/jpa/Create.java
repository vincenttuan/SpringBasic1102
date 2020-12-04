package lab.jpa;

import com.lab.jpa.Club;
import com.lab.jpa.Department;
import com.lab.jpa.Employee;
import com.lab.jpa.Salary;
import org.junit.Test;

public class Create extends JPATemplate {
    @Test
    public void t1() {
        Department dept = new Department();
        dept.setName("IT");
        Salary salary = new Salary();
        salary.setMoney(50000);
        Club c1 = new Club();
        c1.setName("A");
        Club c2 = new Club();
        c2.setName("B");
        Employee emp = new Employee();
        emp.setName("Vincent");
        // 配置關聯
        emp.setDepartment(dept);
        emp.setSalary(salary);
        emp.getClubs().add(c1);
        emp.getClubs().add(c2);
        // 儲存
        session.persist(emp);
        
    }
}
