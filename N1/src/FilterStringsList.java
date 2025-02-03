import java.util.List;
import java.util.stream.Collectors;

public class FilterStringsList {
    static List<String> filterStringsWithO(List<String> strings) {
        return strings.stream().filter(string -> string.contains("o")).collect(Collectors.toList());
    }

    static List<String> filterStringsWithOBiggerThan5(List<String> strings) {
        return strings.stream()
                .filter(string -> string.contains("o"))
                .filter(string -> string.length() > 4)
                .collect(Collectors.toList());
    }
}
