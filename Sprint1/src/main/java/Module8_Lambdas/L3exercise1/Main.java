package Module8_Lambdas.L3exercise1;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.getName;

public class Main {
    public static void main(String[] arg){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Juliana", 15, "Java", 6));
        studentList.add(new Student("Ana", 14, "PHP", 4));
        studentList.add(new Student("Pepito", 18, "JavaScript", 8));
        studentList.add(new Student("Gabriela", 13, "React", 5));
        studentList.add(new Student("Juana", 17, "Python", 10));
        studentList.add(new Student("Marie", 12, "Java", 4));
        studentList.add(new Student("Pedro", 19, "PHP", 5));
        studentList.add(new Student("Gabriel", 18, "Python", 1));
        studentList.add(new Student("Santiago", 25, "Java", 7));
        studentList.add(new Student("Liliana", 54, "Java", 3));

        System.out.println("Student's List");
        studentList.forEach(o -> {
            System.out.println(o.getName());
            System.out.println(o.getGrade());
        });

        System.out.println("\nNames that start with A");
        List<String> studentsStartWithA = studentList.stream()
                .filter(o ->  o.getName().startsWith("A"))
                .map(Student::getName)
                .toList();

        studentsStartWithA.forEach(System.out::println);

        System.out.println("\nStudents with a 5 or higher.");
        studentList.stream()
                .filter(o -> o.getGrade() >= 5)
                .forEach(o -> System.out.println(o.getName()));

        System.out.println("\nStudents with a 5 or higher that are not in PHP.");
        studentList.stream()
                .filter(o -> o.getGrade() >= 5 && !(o.getCourse().equals("PHP")))
                .forEach(o -> System.out.println(o.getName()));

        System.out.println("\nStudents in Java who are 18 or older");
        studentList.stream()
                .filter(o -> o.getCourse().equals("Java") && o.getAge() >= 18)
                .forEach(o -> System.out.println(o.getName()));
    }
}
