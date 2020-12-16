package spring.tutorial.chapter3.entity;

import spring.tutorial.chapter3.air.IAir;

public class XMLInstance {
    private String name;
    private IAir air;

    public void setName(String name) {
        this.name = name;
    }

    public void setAir(IAir air) {
        this.air = air;
    }

    public void Breath()
    {
        System.out.println("Name:"+this.name+";Air:"+this.air.toString());
    }

    public XMLInstance(String name, IAir air) {
        super();
        this.name = name;
        this.air = air;
    }
    public XMLInstance() {

    }
    public void DestoryMethod()
    {
        System.out.println("DestoryMethod");
    }
    public void InitMethod()
    {
        System.out.println("InitMethod");
    }
}
