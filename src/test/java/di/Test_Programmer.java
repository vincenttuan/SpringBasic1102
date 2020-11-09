package di;

import com.mycompany.springbasic1102.di.byname.MicrosoftProgrammer;
import com.mycompany.springbasic1102.di.byname.OracleProgrammer;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Programmer {
    @Test
    public void t1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config-2.xml");
        // byName
        OracleProgrammer op = ctx.getBean("oracleProgrammer", OracleProgrammer.class);
        System.out.println(op);
        MicrosoftProgrammer mp = ctx.getBean("microsoftProgrammer", MicrosoftProgrammer.class);
        System.out.println(mp);
        ctx.close();
    }
}
