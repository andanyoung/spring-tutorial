package spring.tutorial.chapter3;


import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.tutorial.chapter3.entity.UserBean;


public class AppTest 
{

    @Test
    public void userBean() throws Exception {

        BeanFactory factory = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        UserBean user = (UserBean)factory.getBean("user");
        user.destroy();
    }
}
