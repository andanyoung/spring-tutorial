package spring.tutorial.chapter2.AOP.impl;

import spring.tutorial.chapter2.AOP.IService;

public class ProxyServiceA implements IService {

    private IService service;
    public ProxyServiceA(IService service){
        this.service = service;
    }
    @Override
    public void service(String name) throws Exception {
        System.out.println("log start");
        try {
            service.service(name);
        }catch (Exception e){
            throw e;
        }
        System.out.println("log end");
    }

  public static void main(String[] args) throws Exception {
      IService service = new ServiceImplA();
      service= new ProxyServiceA(service);
      service.service("CYW");
  }
}
