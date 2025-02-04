package academy.filters;

import academy.Student;

import java.util.function.Predicate;

public class GradeMoreThan5 implements FilterStudents<Student>{

    @Override
    public Predicate<Student> filterWith() {
        return student -> student.getGrade()>=5;
    }
}
