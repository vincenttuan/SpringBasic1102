package jdbc.invoice;

import com.mycompany.springbasic1102.jdbc.invoice.dao.InvoiceDao;
import com.mycompany.springbasic1102.jdbc.invoice.entity.Invoice;
import com.mycompany.springbasic1102.jdbc.invoice.entity.Item;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.simpleflatmapper.jdbc.spring.JdbcTemplateMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:jdbc-config.xml"})
public class Test3 {
    @Autowired
    private InvoiceDao invoiceDao;
    @Test
    public void t3() {
        List<Item> items = invoiceDao.queryIntem();
        System.out.println(items);
    }
}
