package N2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Initializer {
    static public List<String> initializeAListOfNames() {
        return Arrays.asList("John", "Ana", "Alberto", "Herminia", "Fina", "Noa", "Anya", "Asa", "Mireia", "Pablo");
    }

    static public List<Integer> initializeAListOfNumbers() {
        return Arrays.asList(1, 2, 77, 91, 121, 12, 17, 99);
    }

    static public List<String> initializeAListOfNamesAndNumbers() {
        List<String> namesAndNumbers = new ArrayList<>(initializeAListOfNumbers().stream().map(String::valueOf).toList());
        namesAndNumbers.addAll(initializeAListOfNames());
        return namesAndNumbers;
    }
}
