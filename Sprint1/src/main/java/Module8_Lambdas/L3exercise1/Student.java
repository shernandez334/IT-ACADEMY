package Module8_Lambdas.L3exercise1;

public class Student {
    private String name;
    private int age;
    private String course;
    private int grade;
    public Student(String name, int age, String course, int grade){
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }
    public String getName(){
        return this.name;
    }
    public int getGrade(){
        return this.grade;
    }
}
