package com.mycompany.springbasic1102.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(value = "singleton")
public class UserDAO {
    @Autowired
    private Users users;
    
    public Users queryUsers() {
        return users;
    }
    public Boolean existByName(String name) {
        return users.getNames().stream()
                .filter(n -> n.equals(name))
                .findFirst()
                .isPresent();
    }
}
