package jpa.one2many;

import com.mycompany.springbasic1102.jpa.entities.one2many.Bookshelf;
import jpa.JPATemplate;
import org.junit.Test;

public class Delete extends JPATemplate {
    @Test
    public void t1() {
        Bookshelf bookshelf = (Bookshelf)session.get(Bookshelf.class, 1);
        // 若透過 cascade = CascadeType.REMOVE 可以集聯刪除(多的一方也都會刪除)
        // 否則多的一方資料仍會保存 外鍵的內容 = null
        session.delete(bookshelf); // 刪除1的一方
    }
}
