package academy;

import java.util.List;

public class StudentPrinter {
    static public void printStudents(List<Student> students){
        students.stream().forEach(student->System.out.println(student.toString()));
    }
    static public void printAgeAndNameStudents (List<Student> students){
        students.stream().forEach(student -> System.out.println(student.getName() + ", age : " + student.getAge()));
    }
}
