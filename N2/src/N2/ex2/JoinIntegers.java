package N2.ex2;

import java.util.List;
import java.util.stream.Collectors;

public class JoinIntegers {
    public static String integersToString(List<Integer> integers) {
        return integers
                .stream()
                .map(num -> num % 2 == 0 ? "e" + num : "o" + num)
                .collect(Collectors.joining(", "));
    }
}
