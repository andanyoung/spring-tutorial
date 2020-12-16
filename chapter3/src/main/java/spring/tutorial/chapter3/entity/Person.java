package spring.tutorial.chapter3.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import spring.tutorial.chapter3.air.IAir;

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
