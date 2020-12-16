package spring.tutorial.CusAnnontation.chapter1.src.spring.tutorial;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Chapter1 {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        //字符串的列子
        Class clazz = null;
        //通过类名获取，类名.class。
        clazz = String.class;
        System.out.println(clazz);
        //通过对象获取，对象.getClass()。
        clazz = "ReflectionTest".getClass();
        //通过全类名获取，Class.forName（全类名）。
        clazz = Class.forName("java.lang.String");
        System.out.println(clazz);


        reflectionTest();

//        CustomDescriptions annotation = new Student().getClass().getAnnotation(CustomDescriptions.class);
//        for (CustomDescription h: annotation.value()){
//      System.out.println("description" + h.description());
//        }
    }

    public static void reflectionTest() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Class<?> clazz = Class.forName("spring.tutorial.CusAnnontation.chapter1.src.spring.tutorial.CusAnnontation.Student");
        Method method = null;
        Method[] methods = null;

        methods = clazz.getMethods();
        for (Method mth : methods){
            System.out.print(mth.getName() + " ");
        }
        System.out.println();

        method = clazz.getMethod("StudentPublicMethod",String.class);
        System.out.print(method.getName() + " ");
        System.out.println();

        methods = clazz.getDeclaredMethods();
        for (Method mth : methods){
            System.out.print(mth.getName() + " ");
        }
        System.out.println();

        method = clazz.getDeclaredMethod("StudentPrivateMethod",String.class);
        System.out.print(method.getName() + " ");
        System.out.println();

        Object obj = clazz.newInstance();
        method.setAccessible(true);
        String result = (String) method.invoke(obj, "inputParams");
        System.out.println(result);
    }
}
