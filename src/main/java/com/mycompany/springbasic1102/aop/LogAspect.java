package com.mycompany.springbasic1102.aop;

import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1) // 數字越小越先被執行
public class LogAspect {
    @Pointcut(value = "execution(* com.mycompany.springbasic1102.aop.*.*(..))")
    public void cut() {
    }
    // 前置通知(Advice)
    //@Before(value = "execution(public int com.mycompany.springbasic1102.aop.CalcImpl.add(int, int))") // 切入點表達式
    //@Before(value = "execution(public int com.mycompany.springbasic1102.aop.CalcImpl.*(int, int))") // 切入點表達式
    //@Before(value = "execution(public int com.mycompany.springbasic1102.aop.*.*(int, int))") // 切入點表達式
    //@Before(value = "execution(* com.mycompany.springbasic1102.aop.*.*(..))") // 切入點表達式
    //@Before(value = "execution(* *.*(..))") // 切入點表達式
    @Before(value = "cut()") // 切入點參照
    public void before(JoinPoint joinPoint) { 
        // 獲取方法名稱
        String methodName = joinPoint.getSignature().getName();
        // 獲取方法參數
        Object[] args = joinPoint.getArgs();
        System.out.printf("前置通知 -> 方法名稱: %s, 方法參數: %s\n", methodName, Arrays.toString(args));
    }
    
    // 後置通知(Advice)
    // 無論是否有例外發生都會被執行, 因後置通知作用在 finally 中...
    @After(value = "cut()") // 切入點參照
    public void after() {
        System.out.println("後置通知:");
    }
    
    
}
