package academy.filterInterfaceStrategy.filters;

import academy.model.Student;

import java.util.function.Predicate;

public class JavaStudent implements FilterStudents<Student> {
    @Override
    public Predicate<Student> filterWith() {
        return student -> student.getCourse().equals("JAVA");
    }
}
