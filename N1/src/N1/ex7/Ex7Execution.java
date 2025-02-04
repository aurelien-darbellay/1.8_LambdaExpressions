package N1.ex7;

import N1.generalUtils.Initializer;

import java.util.List;

public class Ex7Execution {
    static public void run() {
        List<String> stringsAndMore = Initializer.initializeMixedList();
        stringsAndMore.sort((a, b) -> b.length() - a.length());
        stringsAndMore.forEach(System.out::println);
    }
}
