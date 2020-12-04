package jpa.many2many;

import com.mycompany.springbasic1102.jpa.entities.many2many.Cstock;
import jpa.JPATemplate;
import org.junit.Test;

public class Create extends JPATemplate {
    @Test
    public void t1() {
        // 建立股票
        Cstock cstock = new Cstock();
        cstock.setSymbol("2330.TW");
    }
}
