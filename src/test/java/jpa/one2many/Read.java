package jpa.one2many;

import com.mycompany.springbasic1102.jpa.entities.one2many.Bookshelf;
import jpa.JPATemplate;
import org.junit.Test;

public class Read extends JPATemplate {
    @Test
    public void t1() {
        Bookshelf bookshelf = (Bookshelf)session.get(Bookshelf.class, 1);
        System.out.println(bookshelf.getName());
        System.out.println(bookshelf.getBooks());
    }
}
