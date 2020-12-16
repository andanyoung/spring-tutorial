package spring.tutorial.chapter3.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.tutorial.chapter3.air.impl.CleanAir;
import spring.tutorial.chapter3.air.impl.DirtyAir;
import spring.tutorial.chapter3.entity.Person;

@Configuration
public class AppConf {

    @Bean
    public CleanAir cleanAir1(){
        return new CleanAir();
    }

    @Bean
    public DirtyAir dirtyAir(){
        return new DirtyAir();
    }


    @Bean
    public Person person(){
        return new Person(dirtyAir());
    }
}
