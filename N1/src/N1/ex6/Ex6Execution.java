package N1.ex6;

import N1.generalUtils.Initializer;

import java.util.List;

public class Ex6Execution {
    static public void run() {
        List<String> stringsAndMore = Initializer.initializeMixedList();
        stringsAndMore.sort((a, b) -> a.length() - b.length());
        stringsAndMore.forEach(System.out::println);
    }
}
