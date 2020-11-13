package com.mycompany.springbasic1102.aop;

import org.springframework.stereotype.Component;

@Component
public class CalcImpl implements Calc {

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int sub(int x, int y) {
        return x - y;
    }

    @Override
    public int mul(int x, int y) {
        return x * y;
    }

    @Override
    public int div(int x, int y) {
        return x / y;
    }
    
}
