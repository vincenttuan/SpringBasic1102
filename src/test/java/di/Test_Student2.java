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
        Student s4 = ctx.getBean("s4", Student.class);
        System.out.println(s4);
        Student s5 = ctx.getBean("s5", Student.class);
        System.out.println(s5);
        Student s6 = ctx.getBean("s6", Student.class);
        System.out.println(s6);
        Student s7 = ctx.getBean("s7", Student.class);
        System.out.println(s7);
        
        ctx.close();
    }
}
