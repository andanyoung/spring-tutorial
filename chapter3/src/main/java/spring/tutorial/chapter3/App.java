package spring.tutorial.chapter3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.tutorial.chapter3.air.impl.CleanAir;
import spring.tutorial.chapter3.air.impl.DirtyAir;
import spring.tutorial.chapter3.conf.AppConf;
import spring.tutorial.chapter3.entity.UserBean;
import spring.tutorial.chapter3.entity.XMLInstance;

/** Hello world! */
public class App {
  public static void main(String[] args) {

    ApplicationContext context =
        new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
    BeanFactory factory = context;

    UserBean user = (UserBean) factory.getBean("user");

    AppConf conf = (AppConf) factory.getBean("appConf");
    conf.person().breath();
    System.out.println("====getBean========");
    CleanAir cleanAir = (CleanAir) factory.getBean("cleanAir");
    System.out.println(cleanAir);
    DirtyAir dirtyAir = factory.getBean(DirtyAir.class);
    System.out.println(dirtyAir);

    XMLInstance instance = (XMLInstance) factory.getBean("xmlinstance");
    instance.setName("123");
    instance.Breath();
    instance = (XMLInstance) factory.getBean("xmlinstance");
    instance.Breath();
  }
}
