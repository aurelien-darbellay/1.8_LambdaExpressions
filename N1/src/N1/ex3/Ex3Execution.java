package N1.ex3;

import N1.generalUtils.Initializer;

public class Ex3Execution {
    public static void run() {
        Initializer.initializeAListOfMonths().stream().forEach(month -> System.out.println(month));
    }
}
