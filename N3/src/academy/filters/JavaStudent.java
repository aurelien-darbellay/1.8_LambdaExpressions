package academy.filters;

import academy.Student;

import java.util.function.Predicate;

public class JavaStudent implements FilterStudents<Student>{
    @Override
    public Predicate<Student> filterWith() {
        return student -> student.getCourse().equals("JAVA");
    }
}
