package spring.tutorial.CusAnnontation;

@CustomDescription(description = "学生")
public class Student extends Person {

    private String StudentId;

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }


    public Student(String name,String studentId){
        super(name);
        StudentId = studentId;
    }

    public Student(){
        super();
    }
    public Student(String name){
        super(name);
        StudentId = "123456";
    }

    public String StudentPublicMethod(String str){
        return str;
    }

    private String StudentPrivateMethod(String str){
        return str;
    }
}
