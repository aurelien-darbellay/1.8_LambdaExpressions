import academy.enhancedListStrategy.EnhancedListStrategy;
import academy.filterInterfaceStrategy.FilterInterfaceStrategy;
import academy.straightforwardStrategy.StaightforwardStrategy;

public class Main {
    public static void main(String[] args) {

        //With enhanced List
        System.out.println("With Enhanced List\n");
        EnhancedListStrategy.run();

        //With Filter Interface
        System.out.println("\nWith filter interface\n");
        FilterInterfaceStrategy.run();

        //Straightforward Strategy
        System.out.println("\nSimpler version\n");
        StaightforwardStrategy.run();
    }
}