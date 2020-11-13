package com.mycompany.springbasic1102.proxy.dyn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynProxy {
    private Object object;
    public DynProxy(Object object) {
        this.object = object;
    }
    
    public Object getProxy() {
        // 獲取當前類別的類加載器, 用來加載代理物件所屬的類別
        ClassLoader loader = object.getClass().getClassLoader();
        // 取取當前物件所實作的介面
        Class[] interfaces = object.getClass().getInterfaces();
        // 處理者 （Handler）
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        };
        return null;
    }
    
}
