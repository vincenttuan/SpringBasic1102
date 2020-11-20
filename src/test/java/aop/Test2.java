package aop;

import com.mycompany.springbasic1102.aop.Calc;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mycompany.springbasic1102.aop.Bmi2;

public class Test2 {
    @Test
    public void t1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("aop-config.xml");
        Bmi2 bmi = ctx.getBean("bmiImpl", Bmi2.class);
        System.out.println(bmi.calc(170.0, 60.0));
        ctx.close();
    }
}
