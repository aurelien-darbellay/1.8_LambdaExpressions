package N2.ex3;

import N2.Initializer;

import java.util.List;

public class Ex3Execution {
    static public void run() {
        List<Integer> integers = Initializer.initializeAListOfNumbers();
        ArithmeticOperation sum = (a, b) -> a + b;
        ArithmeticOperation substraction = (a, b) -> a - b;
        ArithmeticOperation multiplication = (a, b) -> a * b;
        ArithmeticOperation division = (a, b) -> a / b;
        System.out.format("Here we do the %s of 77 and 12%n", "sum");
        System.out.println(sum.operation(integers.get(2), integers.get(5)));
        System.out.format("Here we do the %s of 77 and 12%n", "substraction");
        System.out.println(substraction.operation(integers.get(2), integers.get(5)));
        System.out.format("Here we do the %s of 77 and 12%n", "multiplication");
        System.out.println(multiplication.operation(integers.get(2), integers.get(5)));
        System.out.format("Here we do the %s of 77 and 12%n", "division");
        System.out.println(division.operation(integers.get(2), integers.get(5)));
    }
}
