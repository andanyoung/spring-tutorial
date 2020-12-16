package spring.tutorial.chapter2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** Hello world! */
public class Chapter1 {
  public static void main(String[] args) {
    ApplicationContext context =
        new ClassPathXmlApplicationContext(new String[] {"ApplicationContext.xml"});
    BeanFactory factory = context;
    Person person = (Person) factory.getBean("person");
    person.breath();
  }
}
