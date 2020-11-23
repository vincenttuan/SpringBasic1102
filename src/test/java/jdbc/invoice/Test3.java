package jdbc.invoice;

import com.mycompany.springbasic1102.jdbc.invoice.dao.InvoiceDao;
import com.mycompany.springbasic1102.jdbc.invoice.entity.Item;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
        // 每一張發票有那些商品?
        // 使用 Java 8 grouping by
        System.out.println("每一張發票有那些商品?");
        System.out.println(
            items.stream()
                .collect(groupingBy(item-> item.getInvoice().getId(), Collectors.toList()))
        );
        //每一張發票有幾件商品?
        System.out.println("每一張發票有幾件商品?");
        System.out.println(
            items.stream()
                .collect(groupingBy(item-> item.getInvoice().getId(), Collectors.counting()))
        );
        //每一張發票價值多少?
        System.out.println("每一張發票價值多少?");
        System.out.println(
            items.stream()
                .collect(groupingBy(item-> item.getInvoice().getId(), 
                        Collectors.summingInt(item -> item.getAmount() * item.getProduct().getPrice())))
        );
        //每一樣商品各賣了多少?
        //哪一件商品賣得錢最多?
        //哪一張發票價值最高（請練習看看）?

    }
}
