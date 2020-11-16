package jdbc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test1 {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
    JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
        
    @Test
    public void t1() {
        System.out.println(jdbcTemplate);
        create();
    }
    // CRUD - Create 新增資料
    private void create() {
        String sql = "Insert Into Emp(ename, age, sex) Values('John', 18, '男')";
        jdbcTemplate.update(sql);
    }
}
