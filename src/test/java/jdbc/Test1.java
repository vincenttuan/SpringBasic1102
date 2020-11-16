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
        //create();
        create("Mary", 19, "女");
    }
    // CRUD - Create 新增資料
    private void create() {
        String sql = "Insert Into Emp(ename, age, sex) Values('John', 18, '男')";
        jdbcTemplate.update(sql);
    }
    // CRUD - Create 新增資料2
    private void create(String ename, Integer age, String sex) {
        String sql = "Insert Into Emp(ename, age, sex) Values(?, ?, ?)";
        jdbcTemplate.update(sql, ename, age, sex);
    }
    
}
