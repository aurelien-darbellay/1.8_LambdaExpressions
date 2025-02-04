package academy.straightforwardStrategy.studentManagement;

import academy.generalUtils.Initialize;
import academy.generalUtils.StudentPrinter;
import academy.model.Student;

import java.util.List;

import static academy.straightforwardStrategy.studentManagement.GroupStudents.*;

public class StaightforwardStrategy {
    static public void run() {
        List<Student> studentsAsMereList = Initialize.initializeTenStudents();
        System.out.println("Name and ages of all students:");
        StudentPrinter.printAgeAndNameStudents(studentsAsMereList);
        System.out.println("\nStudents whose name start with A:");
        StudentPrinter.printStudents(selectNameStartWith(studentsAsMereList));
        System.out.println("\nStudents whose grade is above 5:");
        StudentPrinter.printStudents(selectGradeMoreThanFive(studentsAsMereList));
        System.out.println("\nStudents whose grade is above 5 and who aren't studying PHP:");
        StudentPrinter.printStudents(selectNotStudyingPhp(selectGradeMoreThanFive(studentsAsMereList)));
        System.out.println("\nStudents who are major and study JAVA:");
        StudentPrinter.printStudents(selectAdult(selectStudyJava(studentsAsMereList)));
    }
}
