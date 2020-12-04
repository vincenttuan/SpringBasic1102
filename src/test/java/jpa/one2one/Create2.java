package jpa.one2one;

import com.mycompany.springbasic1102.jpa.entities.one2one.Boss;
import com.mycompany.springbasic1102.jpa.entities.one2one.Company;
import jpa.JPATemplate;
import org.junit.Test;

public class Create2 extends  JPATemplate{
    @Test
    public void t1() {
        Boss boss = new Boss();
        boss.setName("Mary");
        Company company = new Company();
        company.setName("B公司");
        
        // 配置關聯
        company.setBoss(boss);
        
        // 儲存 (聯集新增)
        // 在 Company 中加上
        // @OneToOne(cascade = CascadeType.PERSIST)
        session.persist(company);
        
    }
}
