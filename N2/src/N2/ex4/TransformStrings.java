package N2.ex4;

import java.util.List;
import java.util.stream.Collectors;

public class TransformStrings {
    static public List<String> turnAInto4(List<String> namesAndNumbers) {
        return namesAndNumbers.stream()
                .map(string -> string.replaceAll("a", "4"))
                .collect(Collectors.toList());
    }
}
