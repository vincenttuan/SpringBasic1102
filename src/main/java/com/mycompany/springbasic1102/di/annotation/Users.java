package com.mycompany.springbasic1102.di.annotation;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Users {
     private List<String> names;
     public Users(){
         System.out.println("建立 Users");
         names = new ArrayList<>();
         names.add("Mary");names.add("John");names.add("Helen");names.add("Tom");
     }

    public List<String> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "Users{" + "names=" + names + '}';
    }
    
}
