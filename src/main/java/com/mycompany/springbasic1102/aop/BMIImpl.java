package com.mycompany.springbasic1102.aop;

import org.springframework.stereotype.Component;

@Component
public class BMIImpl implements BMI {

    @Override
    public Double calc(Double h, Double w) {
        if(w <= 0 || h <= 0) {
            throw new RuntimeException("身高體重資料不正確");
        }
        return w / Math.pow(h/100, 2);
    }
    
}
