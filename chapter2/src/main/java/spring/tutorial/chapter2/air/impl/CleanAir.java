package spring.tutorial.chapter2.air.impl;

import org.springframework.stereotype.Component;
import spring.tutorial.chapter2.air.IAir;

@Component
public class CleanAir implements IAir {
    public  String toString(){
        return "CleanAir";
    }
}
