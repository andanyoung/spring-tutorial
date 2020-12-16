package spring.tutorial.chapter2.AOP.impl;

import com.sun.org.apache.bcel.internal.generic.RET;
import spring.tutorial.chapter2.AOP.IService;

import javax.lang.model.element.VariableElement;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynaProxyService implements InvocationHandler {
    private Object target;//目标对象

    public  Object bind(Object object){
        this.target = object;
        //生产动态代理对象
        Object obj = Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
        return  obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("method:"+ method);
        System.out.println("args:"+ args);
        System.out.println("target:"+ this.target);
        System.out.println("log start");
        try {
             result = method.invoke(this.target, args);
        }catch (Exception e){
            throw e;
        }
        System.out.println("log end");
        return  result;
    }

    public static void main(String[] args) throws Exception {
        IService service = (IService) new DynaProxyService().bind(new ServiceImplA());
        service.service("CYM");
    }
}
