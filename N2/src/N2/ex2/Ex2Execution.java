package N2.ex2;

import N2.Initializer;

import java.util.List;

public class Ex2Execution {
    public static void run() {
        List<Integer> integers = Initializer.initializeAListOfNumbers();
        System.out.println(JoinIntegers.integersToString(integers));
    }
}
