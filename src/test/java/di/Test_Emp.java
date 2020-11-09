package di;

import com.mycompany.springbasic1102.di.byname.MicrosoftProgrammer;
import com.mycompany.springbasic1102.di.byname.OracleProgrammer;
import com.mycompany.springbasic1102.di.bytype.Emp;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Emp {
    @Test
    public void t1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config-2.xml");
        // byType
        Emp emp = ctx.getBean("emp", Emp.class);
        System.out.println(emp);
        ctx.close();
    }
}
