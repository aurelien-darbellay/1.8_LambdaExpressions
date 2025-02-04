package academy.filterInterfaceStrategy.filters;

import academy.model.Student;

import java.util.function.Predicate;

public interface FilterStudents<T extends Student> {
    public Predicate<Student> filterWith();
}
