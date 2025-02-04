package ex1;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {
    public static List<String> filterStartWithAExactly3(List<String> strings){
        return strings.stream().filter(string->string.startsWith("A") && string.length()==3).collect(Collectors.toList());
    }
}
