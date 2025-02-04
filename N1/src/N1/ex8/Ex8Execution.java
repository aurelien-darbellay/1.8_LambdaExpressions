package N1.ex8;

import N1.generalUtils.Initializer;

import java.util.List;

public class Ex8Execution {
    static public void run() {
        List<String> stringsAndMore = Initializer.initializeMixedList();
        Reversor reversor = (input) -> new StringBuilder(input).reverse().toString();
        System.out.println(stringsAndMore.getFirst() + " : " + reversor.reverse(stringsAndMore.getFirst()));
    }
}
