package academy.filterInterfaceStrategy.filters;

import academy.model.Student;

import java.util.function.Predicate;

public class NameStartWithA implements FilterStudents<Student> {
    @Override
    public Predicate<Student> filterWith() {
        return student -> student.getName().toLowerCase().startsWith("a");
    }
}
