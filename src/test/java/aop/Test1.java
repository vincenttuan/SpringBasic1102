package aop;

import com.mycompany.springbasic1102.aop.Calc;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void t1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("aop-config.xml");
        Calc calc = ctx.getBean("calcImpl", Calc.class);
        System.out.println(calc.add(2, 3));
        ctx.close();
    }
}
