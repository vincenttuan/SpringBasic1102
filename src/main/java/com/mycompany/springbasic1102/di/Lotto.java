package com.mycompany.springbasic1102.di;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {
    private Integer amount;
    private Integer begin;
    private Integer end;
    private Set<Integer> nums;

    public Lotto() {
    }

    public Lotto(Integer amount, Integer begin, Integer end) {
        this.amount = amount;
        this.begin = begin;
        this.end = end;
        this.nums = new LinkedHashSet<>();
        Random r = new Random();
        while (this.nums.size() < amount) {            
            int num = r.nextInt(end-begin+1) + begin;
            this.nums.add(num);
        }
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getBegin() {
        return begin;
    }

    public void setBegin(Integer begin) {
        this.begin = begin;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public Set<Integer> getNums() {
        return nums;
    }

    public void setNums(Set<Integer> nums) {
        this.nums = nums;
    }

    @Override
    public String toString() {
        return "Lotto{" + "amount=" + amount + ", begin=" + begin + ", end=" + end + ", nums=" + nums + '}';
    }
    
}
