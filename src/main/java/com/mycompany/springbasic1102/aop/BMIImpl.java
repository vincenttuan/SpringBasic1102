package com.mycompany.springbasic1102.aop;

import org.springframework.stereotype.Component;

@Component
public class BMIImpl implements BMI {

    @Override
    public Double calc(Double h, Double w) {
        return w / Math.pow(h/100, 2);
    }
    
}
