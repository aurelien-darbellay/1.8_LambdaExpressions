package academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Initialize {
    static public ArrayList<Student> initializeTenStudents(){
        List<Student> students = Arrays.asList(new Student("John Hordon",49,"PHP", 8.7),
                new Student("Ljuba Stevanonic",39,"PHP", 8.9),
                new Student("Mar Artiga",51,"JAVA", 9.6),
                new Student("Aurelien Darbellay",41,"JAVA", 4.7),
                new Student("Carlota Serrahima",37,"C#", 6.7),
                new Student("Fernando Alonso",49,"C#", 2.7),
                new Student("Lola FLores",82,"PHP", 9.7),
                new Student("Aureliano Buendía",112,"Alquimia", 1.7),
                new Student("Ursula Buendía",235,"JAVA", 10),
                new Student("Leo Krief",15,"PHP", 8.7));
        return new ArrayList<Student>(students);
    }
}
