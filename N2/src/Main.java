import ex1.StringFilter;
import ex2.JoinIntegers;
import ex3.ArithmeticOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<String> strings = Arrays.asList("John","Ana","Alberto","Herminia","Fina","Noa","Anya","Asa","Mireia","Pablo");
        List<Integer> integers = Arrays.asList(1,2,77,91,121,12,17,99);
        List<String> namesAndNumbers = new ArrayList<>(integers.stream().map(String::valueOf).toList());
        namesAndNumbers.addAll(strings);

        //Ex1
        System.out.println("\nEx1");
        StringFilter.filterStartWithAExactly3(strings).forEach(System.out::println);
        //Ex2
        System.out.println("\nEx2");
        System.out.println(JoinIntegers.integersToString(integers));
        //Ex3
        System.out.println("\nEx3");
        ArithmeticOperation sum = (a, b)-> a+b;
        ArithmeticOperation substraction = (a,b)-> a-b;
        ArithmeticOperation multiplication = (a,b)-> a*b;
        ArithmeticOperation division = (a,b)-> a/b;
        System.out.format("Here we do the %s of 77 and 12%n", "sum");
        System.out.println(sum.operation(integers.get(2),integers.get(5)));
        System.out.format("Here we do the %s of 77 and 12%n", "substraction");
        System.out.println(substraction.operation(integers.get(2),integers.get(5)));
        System.out.format("Here we do the %s of 77 and 12%n", "multiplication");
        System.out.println(multiplication.operation(integers.get(2),integers.get(5)));
        System.out.format("Here we do the %s of 77 and 12%n", "division");
        System.out.println(division.operation(integers.get(2),integers.get(5)));

        //EX4





    }
}
