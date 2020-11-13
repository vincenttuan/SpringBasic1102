package com.mycompany.springbasic1102.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1) // 數字越小越先被執行
public class LogAspect {
    
    // 前置通知(Advice)
    @Before(value = "execution(public int com.mycompany.springbasic1102.aop.CalcImpl.add(int, int))") // 切入點表達式
    public void before() {
        System.out.println("前置通知:");
    }
}
