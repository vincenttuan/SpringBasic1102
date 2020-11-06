package di;

import com.mycompany.springbasic1102.di.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Student2 {
    @Test
    public void test() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
        Student s1 = (Student)ctx.getBean("s1");
        System.out.println(s1);
        Student s2 = ctx.getBean("s2", Student.class);
        System.out.println(s2);
        Student s3 = ctx.getBean("s3", Student.class);
        System.out.println(s3);
    }
}
