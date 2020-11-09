package di;

import com.mycompany.springbasic1102.di.annotation.UserController;
import com.mycompany.springbasic1102.di.annotation.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:beans-config-3.xml"})
public class Test_Annotation {
    @Autowired
    private Users users;
    
    @Autowired
    private UserController userController;
    
    @Test
    public void t1() {
        // 一般模式
        System.out.println(users);
        
        // MVC 模式
        // 查詢所有的 User
        Users users = userController.getAll();
        System.out.println(users);
        // 請各別檢查 "John" 與 "Bob" 是否在 Users 列表中 ?
        Boolean check = userController.existByName("John");
        System.out.println(check);
    }
}
