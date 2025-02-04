package N1.ex4;

import N1.generalUtils.Initializer;

public class Ex4Execution {
    static public void run() {
        Initializer.initializeAListOfMonths().stream().forEach(System.out::println);
    }
}
