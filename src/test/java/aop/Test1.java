package aop;

import com.mycompany.springbasic1102.aop.Calc;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void t1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("aop-config.xml");
        Calc calc = ctx.getBean("calcImpl", Calc.class);
        //System.out.println(calc.add(2, 3));
        //System.out.println(calc.mul(2, 3));
        try {
            System.out.println(calc.div(4, 0));
        } catch (Exception e) {
        }
        ctx.close();
    }
}
