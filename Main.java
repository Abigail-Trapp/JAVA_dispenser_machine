
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // possible variables: list of drinks, money, list of inventory 
        // welcome message
        // options: drink selection, inventory
        // inventory
        // water, milk, coffee, hot chocolate mix 
        // drink selections
        // coffee, hot chocolate, espresso, hot water
        // estimate cost and take money
        // always default back to options menu until user exits
        // goodbye message 

        Scanner scanner = new Scanner(System.in);
        int userOption = 0;
        int userDrinkOption = 0;
        boolean isRunning = true;

        System.out.println("""
        ************************************************
              WELCOME! I AM YOUR JAVA MACHINE
        ************************************************
        """);

        do {
            System.out.println(""" 
                   Select an option:
        1) [view inventory] 2) [select a drink] 3) [Exit]
        """);
            userOption = scanner.nextInt();

            if (userOption == 1) {
                System.out.println("INVENTORY");
            } else if (userOption == 2) {
                System.out.println(""" 
                                    Select a drink
                    1) [coffee] 2) [hot chocolate] 3) [espresso]  4) [tea]
                    """);
                userDrinkOption = scanner.nextInt();
                switch (userDrinkOption) {
                    case 1 ->
                        System.out.println("You picked coffee. Enjoy!");
                    case 2 ->
                        System.out.println("You picked hot chocolate. Enjoy!");
                    case 3 ->
                        System.out.println("You picked espresso. Enjoy!");
                    case 4 ->
                        System.out.println("You picked tea. Enjoy!");
                    default ->
                        System.out.println("Not a valid option!");
                }
            } else if (userOption == 3) {
                isRunning = false;
                System.out.println("Thank you! Goodbye! :)");
            } else {
                System.out.println("Not a valid option!");
            }

        } while (isRunning);
    }
}
