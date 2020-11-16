package jdbc;

import com.mycompany.springbasic1102.jdbc.Emp;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Test1 {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
    JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
        
    @Test
    public void t1() {
        System.out.println(jdbcTemplate);
        //create();
        //create("DeleteMe", 19, "男");
        //updateAgeById(1, 20);
        //deleteById(3);
        //readAll();
        //readAvgOfAge();
        //readAllforEntity();
        readEntityById(2);
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
    // CRUD - Update 更新資料
    private void updateAgeById(Integer eid, Integer age) {
        String sql = "Update Emp Set age=? Where eid=?";
        jdbcTemplate.update(sql, age, eid);
    }
    // CRUD = Delete 刪除資料
    private void deleteById(Integer eid) {
        String sql = "Delete From Emp Where eid = ?";
        jdbcTemplate.update(sql, eid);
    }
    // CRUD - Read 查詢
    private void readAll() {
        String sql = "Select eid, ename, age, sex, ct From Emp";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        System.out.println(list);
        int sum = list.stream().mapToInt(m -> Integer.parseInt(m.get("age")+"")).sum();
        System.out.println(sum);
        double avg = list.stream().mapToInt(m -> Integer.parseInt(m.get("age")+"")).average().getAsDouble();
        System.out.println(avg);
    }
    // CRUD - Read 查詢2
    private void readAllforEntity() {
        String sql = "Select eid, ename, age, sex, ct From Emp";
        // RowMapper
        RowMapper<Emp> rm = new BeanPropertyRowMapper<>(Emp.class); 
        List<Emp> emps = jdbcTemplate.query(sql, rm);
        System.out.println(emps);
    }
    
    // CRUD - Read 查詢單筆
    private void readEntityById(Integer eid) {
        String sql = "Select eid, ename, age, sex, ct From Emp Where eid=?"; 
        RowMapper<Emp> rm = new BeanPropertyRowMapper<>(Emp.class);
        //Emp emp = jdbcTemplate.queryForObject(sql, rm, eid);
        Emp emp = jdbcTemplate.queryForObject(sql, new Object[]{eid}, rm);
        System.out.println(emp);
    }
    
    // CRUD - Read 查詢平均年齡
    private void readAvgOfAge() {
        String sql = "SELECT avg(cast(age as double)) FROM APP.EMP ";
        double avg = jdbcTemplate.queryForObject(sql, Double.class);
        System.out.println("avg=" + avg);
    }
    
}
