package spring.tutorial.CusAnnontation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface CustomDescriptions {
    CustomDescription[] value();
}
