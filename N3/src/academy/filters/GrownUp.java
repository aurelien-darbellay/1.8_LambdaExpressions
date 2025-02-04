package academy.filters;

import academy.Student;

import java.util.function.Predicate;

public class GrownUp implements FilterStudents<Student>{
    @Override
    public Predicate<Student> filterWith() {
        return (Student student) -> student.getAge()>=18;
    }
}
