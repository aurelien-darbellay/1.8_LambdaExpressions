package N2.ex4;

import N2.Initializer;

import java.util.List;

public class Ex4Execution {
    static public void run() {
        List<String> namesAndNumbers = Initializer.initializeAListOfNamesAndNumbers();
        System.out.println("\nNames and Numbers Ordered alphabetically based on first char:");
        OrderNamesAndNumbers.orderAlphaFirstChar(namesAndNumbers).forEach(System.out::println);
        System.out.println("\nNames and Numbers Ordered placing strings containing \"e\" first:");
        OrderNamesAndNumbers.orderContainEFirst(namesAndNumbers).forEach(System.out::println);
        System.out.println("\nNames and Numbers where \"a\" become \"4\":");
        TransformStrings.turnAInto4(namesAndNumbers).forEach(System.out::println);
        System.out.println("\nFilter out non-numerical values:");
        NumbersAsStrings.filterOutNonNumber(namesAndNumbers).forEach(System.out::println);
    }
}
