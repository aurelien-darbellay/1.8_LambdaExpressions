package N1.ex2;

import N1.generalUtils.FilterStringsList;
import N1.generalUtils.Initializer;

public class Ex2Execution {
    static public void run() {
        FilterStringsList.filterStringsWithOBiggerThan5(Initializer.initializeAListOfStrings()).forEach(System.out::println);
    }
}
