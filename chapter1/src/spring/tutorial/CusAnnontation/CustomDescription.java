package spring.tutorial.CusAnnontation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@Repeatable(CustomDescriptions.class)
public @interface CustomDescription {
    String description() default"";
}
