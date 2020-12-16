package spring.tutorial.chapter3.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class UserBean implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean, ApplicationContextAware {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("set方法被调用");
    }

    public UserBean() {
        System.out.println("UserBean类构造方法");
    }

    public void setBeanName(String name) {
        System.out.println("BeanNameAware被调用："+name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware被调用");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean被调用");
    }

    public void destroy() throws Exception {
        System.out.println("DisposableBean被调用");
    }
    //自定义的初始化函数
    public void myInit() {
        System.out.println("myInit被调用");
    }
    //自定义的销毁方法
    public void myDestroy() {
        System.out.println("myDestroy被调用");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext被调用");
    }
}
