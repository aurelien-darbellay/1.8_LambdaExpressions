import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("hola","bla","bailar","comodín","erizo","lameculos","paladín");
        List<String> months = Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","Decembre");

        //Ex1
        System.out.println("\nEx1");
        FilterStringsList.filterStringsWithO(strings).forEach(System.out::println);

        //Ex2
        System.out.println("\nEx2");
        FilterStringsList.filterStringsWithOBiggerThan5(strings).forEach(System.out::println);

        //Ex3
        System.out.println("\nEx3");
        months.stream().forEach(month ->System.out.println(month));

        //Ex4
        System.out.println("\nEx4");
        months.stream().forEach(System.out::println);

        //Ex5
        System.out.println("\nEx4");
        PiValueProvider piProvider = new PiValueProvider() {
            @Override
            public double getPiValue() {
                return 3.1415;
            }
        };
        System.out.println(piProvider.getPiValue());


    }
}