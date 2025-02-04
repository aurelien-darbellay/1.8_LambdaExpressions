package N2.ex4;

import java.util.List;
import java.util.stream.Collectors;

public class NumbersAsStrings {
    static public boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static public List<String> filterOutNonNumber(List<String> namesAndNumbers) {
        return namesAndNumbers.stream().filter(NumbersAsStrings::isNumber).collect(Collectors.toList());
    }
}
