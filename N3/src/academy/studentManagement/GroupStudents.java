package academy.studentManagement;

import academy.Student;

import java.util.List;
import java.util.stream.Collectors;

public class GroupStudents {
    public static List<Student> selectNameStartWith(List<Student> students){
        return students.stream().filter(student -> student.getName().toLowerCase().startsWith("a")).collect(Collectors.toList());
    }
    public static List<Student> selectGradeMoreThanFive(List<Student> students){
        return students.stream().filter(student -> student.getGrade()>=5).collect(Collectors.toList());
    }
    public static List<Student> selectNotStudyingPhp(List<Student> students){
        return students.stream().filter(student -> !student.getCourse().equals("PHP")).collect(Collectors.toList());
    }
    public static List<Student> selectAdult(List<Student> students){
        return students.stream().filter(student -> student.getAge()>=18).collect(Collectors.toList());
    }
    public static List<Student> selectStudyJava(List<Student> students){
        return students.stream().filter(student -> student.getCourse().equals("JAVA")).collect(Collectors.toList());
    }
}
