package spring.tutorial.CusAnnontation.chapter1.src.spring.tutorial.CusAnnontation;

@CustomDescription(description = "基类")
@CustomDescription(description = "人")
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(){
        super();
    }

    public Person(String name){
        this.name = name;
    }

    public String PersonPublicMethod(String str){
        return str;
    }

    private String PersonPrivateMethod(String str){
        return str;
    }
}
