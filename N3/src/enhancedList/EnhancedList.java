package enhancedList;

import academy.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class EnhancedList<T extends academy.Student> extends ArrayList<academy.Student> {

    public EnhancedList(Collection<? extends Student> c) {
        super(c);
    }
    public void displayNameAndAge(){
        this.forEach(student -> System.out.println(student.getName() + ", age: " + student.getAge()));
    }
    public EnhancedList<Student> filterNameStartWithA(){
        return new EnhancedList<>(this.stream().filter(student -> student.getName().toLowerCase().startsWith("a")).collect(Collectors.toList()));
    }
    public EnhancedList<Student> filterGradeMoreThanFive(){
        return new EnhancedList<>(this.stream().filter(student -> student.getGrade()>=5).collect(Collectors.toList()));
    }
    public EnhancedList<Student> filterNoPHP(){
        return new EnhancedList<>(this.stream().filter(student -> !student.getCourse().equals("PHP")).collect(Collectors.toList()));
    }
    public EnhancedList<Student> filterGrownUp(){
        return new EnhancedList<>(this.stream().filter(student -> student.getAge()>=18).collect(Collectors.toList()));
    }
    public EnhancedList<Student> filterJava(){
        return new EnhancedList<>(this.stream().filter(student -> student.getCourse().equals("JAVA")).collect(Collectors.toList()));
    }
    public void displayStudents(){
        this.forEach(student -> System.out.println(student.toString()));
    }
}
