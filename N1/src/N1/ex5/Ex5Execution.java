package N1.ex5;

public class Ex5Execution {
    static public void run() {
        PiValueProvider piProvider = new PiValueProvider() {
            @Override
            public double getPiValue() {
                return 3.1415;
            }
        };
        System.out.println(piProvider.getPiValue());
    }
}
