
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
        int userInventoryOption = 0;
        int addMoreIngredients = 0;
        int howMany = 0;
        boolean isRunning = true;


        //Ingredients
        int hotWater = 20;
        int cocoPowder = 5;
        int coffeeGrinds = 10;
        int espressoShots = 5;
        int greenTeaBags = 5;

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
                System.out.printf("""
                    INVENTORY
            
            Hot Water:           %4d\n
            Coffee:              %4d\n
            Hot Chocolate:       %4d\n
            Espresso:            %4d\n
            Tea:                 %4d\n

            1] Add More Ingredients  
            2] Exit 
                """, hotWater, coffeeGrinds, cocoPowder, espressoShots, greenTeaBags);
            
            userInventoryOption = scanner.nextInt();
            if(userInventoryOption == 1){
                System.out.println(""" 
                    What do you want to refill?
            1] Hot Water
            2] Coffee
            3] Hot Chocolate
            4] Tea        
                    """);
            addMoreIngredients = scanner.nextInt();
            if(addMoreIngredients == 1){
                System.out.println("How much more Hot Water do you want to add?");
                howMany = scanner.nextInt();
                hotWater += howMany;
                System.out.println(hotWater);
            }
            }





            } else if (userOption == 2) {
                System.out.println(""" 
                                    Select a drink
                    1) [coffee] 2) [hot chocolate] 3) [espresso]  4) [tea]
                    """);
                userDrinkOption = scanner.nextInt();
                switch (userDrinkOption) {
                    case 1 -> {
                        if (coffeeGrinds == 0) {
                            System.out.println("Sorry, out of Coffee :(");
                        } else {
                            System.out.println("You picked Coffee. Enjoy!");
                            coffeeGrinds-=1;
                            hotWater-=1;

                        }
                    }
                    case 2 -> {
                        if (cocoPowder == 0) {
                            System.out.println("Sorry, out of Hot Chocolate :(");
                        } else {
                            System.out.println("You picked Hot Chocolate. Enjoy!");
                            cocoPowder -= 1;
                             hotWater-=1;
                        }
                    }
                    case 3 -> {
                        if (espressoShots == 0) {
                            System.out.println("Sorry, out of Espresso :(");
                        } else {
                            System.out.println("You picked Espresso. Enjoy!");
                            espressoShots -= 1;
                             hotWater-=1;
                        }
                    }
                    case 4 -> {
                        if (greenTeaBags == 0) {
                            System.out.println("Sorry, out of Tea :(");
                        } else {
                            System.out.println("You picked Tea. Enjoy!");
                            greenTeaBags-=1;
                            hotWater-=1;
                        }
                    }
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
