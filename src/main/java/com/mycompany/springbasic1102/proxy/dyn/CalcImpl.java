package com.mycompany.springbasic1102.proxy.dyn;

public class CalcImpl implements Calc {

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int sub(int x, int y) {
        return x - y;
    }
    
}
