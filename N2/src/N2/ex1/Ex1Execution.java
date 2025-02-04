package N2.ex1;

import N2.Initializer;

import java.util.List;

public class Ex1Execution {
    static public void run() {
        List<String> names = Initializer.initializeAListOfNames();
        StringFilter.filterStartWithAExactly3(names).forEach(System.out::println);
    }
}
