package spring.tutorial.chapter3.air.impl;

import org.springframework.stereotype.Component;
import spring.tutorial.chapter3.air.IAir;

//@Component
public class CleanAir implements IAir {
    public  String toString(){
        return "CleanAir";
    }
}
