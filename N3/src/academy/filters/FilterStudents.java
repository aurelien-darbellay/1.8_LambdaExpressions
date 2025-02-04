package academy.filters;

import academy.Student;

import java.util.function.Predicate;

public interface FilterStudents<T extends Student> {
    public Predicate<Student> filterWith();
}
