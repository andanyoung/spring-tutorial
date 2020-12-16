package spring.tutorial.chapter4.aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import spring.tutorial.chapter4.service.impl.AOPServicesImpl;

import java.lang.reflect.Method;

public class AOPInterceptor  implements AfterReturningAdvice,MethodBeforeAdvice,ThrowsAdvice{
    public void afterReturning(Object value, Method method, Object[] args, Object instance) throws Throwable {

        System.out.println("方法"+method.getName()+"运行结束,返回值为:"+value);
    }

    public void before(Method method, Object[] args, Object instance) throws Throwable {
        System.out.println("ִ执行MethodBeforeAdvice,即将执行的方法:"+method.getName());
        if(instance instanceof AOPServicesImpl)
        {
            String description=((AOPServicesImpl)instance).getDescription();
            if(description==null)
            {
                throw new NullPointerException("description为 null");
            }
        }
    }
    public void afterThrowing(Exception ex){
        System.out.println("抛出异常："+ex.getMessage());
    }

    public void afterThrowing(Method method, Object[] args, Object target, Exception ex){
        System.out.println("方法"+method.getName()+"抛出异常："+ex.getMessage());
    }
}
