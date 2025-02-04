package academy.filters;

import academy.Student;

import java.util.function.Predicate;

public class NameStartWithA implements FilterStudents<Student> {
    @Override
    public Predicate<Student> filterWith() {
        return student -> student.getName().toLowerCase().startsWith("a");
    }
}
