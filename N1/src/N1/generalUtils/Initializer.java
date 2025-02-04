package N1.generalUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Initializer {
    static public List<String> initializeAListOfStrings() {
        return Arrays.asList("hola", "bla", "bailar", "comodín", "erizo", "lameculos", "paladín");
    }

    static public List<String> initializeAListOfMonths() {
        return Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "Decembre");
    }

    static public List<String> initializeMixedList() {
        List<String> stringsAndMore = new ArrayList<>(initializeAListOfStrings());
        stringsAndMore.add("2");
        stringsAndMore.add("3");
        return stringsAndMore;
    }
}
