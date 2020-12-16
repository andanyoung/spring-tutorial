package spring.tutorial.chapter3.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CusBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(bean);
        System.out.println("postProcessBeforeInitialization被调用："+beanName);
        return bean;

    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(bean);
        System.out.println("postProcessAfterInitialization被调用："+beanName);
        return bean;
    }
}
