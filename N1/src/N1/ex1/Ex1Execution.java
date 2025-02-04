package N1.ex1;

import N1.generalUtils.FilterStringsList;
import N1.generalUtils.Initializer;

public class Ex1Execution {
    static public void run() {
        FilterStringsList.filterStringsWithO(Initializer.initializeAListOfStrings()).forEach(System.out::println);
    }
}
