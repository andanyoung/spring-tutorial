package spring.tutorial.chapter3.entity;

import spring.tutorial.chapter3.air.impl.CleanAir;

public class XMLFactory {
    public XMLInstance CreateInstance()
    {
        return new XMLInstance("instance",new CleanAir());
    }

    public static XMLInstance CreateStaticInstance()
    {
        return new XMLInstance("static instance",new CleanAir());
    }
}
