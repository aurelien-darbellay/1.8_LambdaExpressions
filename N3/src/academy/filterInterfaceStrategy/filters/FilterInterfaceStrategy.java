package academy.filterInterfaceStrategy.filters;

import academy.generalUtils.Initialize;
import academy.generalUtils.StudentPrinter;
import academy.model.Student;

import java.util.List;

public class FilterInterfaceStrategy {
    static public void run() {
        List<Student> studentsAsSimpleList = Initialize.initializeTenStudents();
        System.out.println("Name and ages of all students:");
        StudentPrinter.printAgeAndNameStudents(studentsAsSimpleList);
        System.out.println("\nStudents whose name start with A:");
        StudentPrinter.printStudents(studentsAsSimpleList.stream().filter(new NameStartWithA().filterWith()).toList());
        System.out.println("\nStudents whose grade is above 5:");
        StudentPrinter.printStudents(studentsAsSimpleList.stream().filter(new GradeMoreThan5().filterWith()).toList());
        System.out.println("\nStudents whose grade is above 5 and who aren't studying PHP:");
        StudentPrinter.printStudents(
                studentsAsSimpleList.stream()
                        .filter(new GradeMoreThan5().filterWith())
                        .filter(new NotPhpStudent().filterWith())
                        .toList());
        System.out.println("\nStudents who are major and study JAVA:");
        StudentPrinter.printStudents(
                studentsAsSimpleList.stream()
                        .filter(new GrownUp().filterWith())
                        .filter(new JavaStudent().filterWith())
                        .toList());
    }
}
