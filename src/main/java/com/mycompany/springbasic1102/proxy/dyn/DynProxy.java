package com.mycompany.springbasic1102.proxy.dyn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

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
                // 加入公用程式
                MyLogger.before(object.getClass(), method.getName(), args);
                Object result = method.invoke(object, args); // 代理調用目標物件的方法
                MyLogger.end(object.getClass(), method.getName(), result);
                return result;
            }
        };
        return Proxy.newProxyInstance(loader, interfaces, h);
    }
    
}
