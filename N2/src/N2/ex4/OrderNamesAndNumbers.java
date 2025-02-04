package N2.ex4;

import java.util.List;

public class OrderNamesAndNumbers {
    static public List<String> orderAlphaFirstChar(List<String> namesAndNumbers) {
        namesAndNumbers.sort((a, b) -> {
            Double aForComparison = NumbersAsStrings.isNumber(a) ? Double.parseDouble(a) : (double) a.charAt(0);
            Double bForComparison = NumbersAsStrings.isNumber(b) ? Double.parseDouble(b) : (double) b.charAt(0);
            return aForComparison - bForComparison < 0 ? -1 : 1;
        });
        return namesAndNumbers;
    }

    static public List<String> orderContainEFirst(List<String> namesAndNumbers) {
        namesAndNumbers.sort((a, b) -> {
            if (a.contains("e")) return -1;
            else if (b.contains("e")) return 1;
            return 0;
        });
        return namesAndNumbers;
    }
}
