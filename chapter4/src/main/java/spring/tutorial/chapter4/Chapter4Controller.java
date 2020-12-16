package spring.tutorial.chapter4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.tutorial.chapter4.service.IAOPService;

public class Chapter4Controller {
  public static void main(String[] args) throws Exception {
    aj();
  }

  public static void aj() throws Exception {
    ApplicationContext context =
        new ClassPathXmlApplicationContext(new String[] {"ajApplicationContext.xml"});
    BeanFactory factory = context;
    IAOPService services = (IAOPService) context.getBean("serviceImplA");
    services.withAopMethod();
    services.withNoAopMethod();
  }

  public void spring() throws Exception {
    ApplicationContext context =
        new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
    BeanFactory factory = context;
    IAOPService services = (IAOPService) context.getBean("aopService");
    services.withAopMethod();
    services.withNoAopMethod();
  }
}
