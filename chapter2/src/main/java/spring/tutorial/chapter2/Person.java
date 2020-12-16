package spring.tutorial.chapter2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.stereotype.Component;
import spring.tutorial.chapter2.air.IAir;

@Component
public class Person {

    IAir air;
    @Autowired //对构造函数进行标注
    public Person(@Qualifier("dirtyair") IAir air){
        this.air = air;
    }
    public  String toString(){
        return "Person";
    }

    public void breath(){
        System.out.println(air.toString());
    }
}
