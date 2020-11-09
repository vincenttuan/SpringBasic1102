package com.mycompany.springbasic1102.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(value = "prototype")
public class UserController {
    @Autowired
    private UserService userService;
    
    public Users getAll() {
        return userService.findAllUser();
    }
    
    public Boolean existByName(String name) {
        return userService.existByName(name);
    }
}
