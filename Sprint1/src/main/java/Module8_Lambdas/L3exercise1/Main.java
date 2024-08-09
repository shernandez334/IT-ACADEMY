package Module8_Lambdas.L3exercise1;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.getName;

public class Main {
    public static void main(String[] arg){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Juliana", 15, "9a", 6));
        studentList.add(new Student("Juan", 14, "7a", 10));
        studentList.add(new Student("Pepito", 18, "12a", 8));
        studentList.add(new Student("Gabriela", 13, "6a", 3));
        studentList.add(new Student("Juana", 17, "11a", 10));
        studentList.add(new Student("Marie", 12, "5a", 9));
        studentList.add(new Student("Pedro", 19, "12a", 4));
        studentList.add(new Student("Gabriel", 18, "11a", 8));
        studentList.add(new Student("Santiago", 25, "18a", 7));
        studentList.add(new Student("Liliana", 15, "9a", 3));

        studentList.forEach(o -> {
            System.out.println(o.getName());
            System.out.println(o.getGrade());
        });
    }
}
