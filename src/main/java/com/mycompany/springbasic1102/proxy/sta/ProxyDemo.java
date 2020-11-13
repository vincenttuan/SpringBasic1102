package com.mycompany.springbasic1102.proxy.sta;

interface Subject {
    void request();
}

class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("下周會有秋老虎"); // 業務程式
    }
}

class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }
    
    @Override
    public void request() {
        System.out.println("Log before ..."); // 公用程式
        subject.request(); // 調用指定的業務程式
        System.out.println("Log end ..."); // 公用程式
    }

}

public class ProxyDemo {
    public static void main(String[] args) {
//        Subject subject = new RealSubject();
//        subject.request();
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
