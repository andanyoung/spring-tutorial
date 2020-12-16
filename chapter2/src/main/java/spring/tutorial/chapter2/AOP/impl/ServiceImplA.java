package spring.tutorial.chapter2.AOP.impl;

import spring.tutorial.chapter2.AOP.IService;

public class ServiceImplA implements IService {

  @Override
  public void service(String name) throws Exception {
    System.out.println("ServiceImplA name" + name);
  }
}
