package di;

import com.mycompany.springbasic1102.di.Lotto;
import com.mycompany.springbasic1102.di.Student;
import com.mycompany.springbasic1102.di.Teacher;
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
        Student s8 = ctx.getBean("s8", Student.class);
        System.out.println(s8);
        Student s9 = ctx.getBean("s9", Student.class);
        System.out.println(s9);
        Teacher t3 = ctx.getBean("t3", Teacher.class);
        System.out.println(t3);
        Teacher t4 = ctx.getBean("t4", Teacher.class);
        System.out.println(t4);
        Lotto lotto1 = ctx.getBean("lotto", Lotto.class);
        System.out.println("lotto1: " + lotto1);
        Lotto lotto2 = ctx.getBean("lotto", Lotto.class);
        System.out.println("lotto2: " + lotto2);
        
        Lotto lotto3 = ctx.getBean("lotto2", Lotto.class);
        System.out.println("lotto3: " + lotto3);
        Lotto lotto4 = ctx.getBean("lotto2", Lotto.class);
        System.out.println("lotto4: " + lotto4);
        
        Lotto lotto5 = ctx.getBean("lotto3", Lotto.class);
        System.out.println("lotto5: " + lotto5);
        ctx.close();
    }
}
