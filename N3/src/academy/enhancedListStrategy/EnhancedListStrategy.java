package academy.enhancedListStrategy;

import academy.enhancedListStrategy.enhancedList.EnhancedList;
import academy.generalUtils.Initialize;
import academy.model.Student;

public class EnhancedListStrategy {
    static public void run() {
        EnhancedList<Student> students = new EnhancedList<>(Initialize.initializeTenStudents());
        System.out.println("Name and ages of all students:");
        students.displayNameAndAge();
        System.out.println("\nStudents whose name start with A:");
        students.filterNameStartWithA().displayStudents();
        System.out.println("\nStudents whose grade is above 5:");
        students.filterGradeMoreThanFive().displayStudents();
        System.out.println("\nStudents whose grade is above 5 and who aren't studying PHP:");
        students.filterGradeMoreThanFive().filterNoPHP().displayStudents();
        System.out.println("\nStudents who are major and study JAVA:");
        students.filterGrownUp().filterJava().displayStudents();
    }
}
