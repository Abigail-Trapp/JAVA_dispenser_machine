
import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
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
        int userOption;
        int userDrinkOption;
        int userInventoryOption;
        int addMoreIngredients;
        int howMany;
        double balance = 0.00;
        double userPaying;
        boolean isRunning = true;

        //Ingredients
        int hotWater = 20;
        int coffeeGrinds = 10;
        int cocoPowder = 5;
        int espressoShots = 5;
        int greenTeaBags = 5;

        //Cost
        double coffeePrice = 3.80;
        double hotCocoPrice = 5.98;
        double espressoPrice = 2.99;
        double teaPrice = 6.70;

        System.out.println("""
        ************************************************
              WELCOME! I AM YOUR JAVA MACHINE
        ************************************************
        """);

        do {
            System.out.println(""" 
        Select an option:

        1] view inventory 
        2] select a drink
        3] check balance  
        4] Exit
        """);
            userOption = scanner.nextInt();

            switch (userOption) {
                case 1 -> {
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
                    if (userInventoryOption == 1) {
                        System.out.println("""
                        What do you want to refill?

                        1] Hot Water
                        2] Coffee
                        3] Hot Chocolate
                        4] Espresso
                        5] Tea
                                """);
                        addMoreIngredients = scanner.nextInt();
                        switch (addMoreIngredients) {
                            case 1 -> {
                                System.out.println("How much more Hot Water do you want to add?");
                                howMany = scanner.nextInt();
                                hotWater += howMany;
                            }
                            case 2 -> {
                                System.out.println("How much more Coffee Grinds do you want to add?");
                                howMany = scanner.nextInt();
                                coffeeGrinds += howMany;
                            }
                            case 3 -> {
                                System.out.println("How much more Coco Powder do you want to add?");
                                howMany = scanner.nextInt();
                                cocoPowder += howMany;
                            }
                            case 4 -> {
                                System.out.println("How much more Espresso do you want to add?");
                                howMany = scanner.nextInt();
                                espressoShots += howMany;
                            }
                            case 5 -> {
                                System.out.println("How much more Tea do you want to add?");
                                howMany = scanner.nextInt();
                                greenTeaBags += howMany;
                            }
                            default ->
                                System.out.println("Not an option!");
                        }
                    }
                }
                case 2 -> {
                    if (hotWater != 0) {
                        System.out.printf("""
                        Select a drink

                        1] coffee $%.2f\n
                        2] hot chocolate $%.2f\n
                        3] espresso $%.2f\n
                        4] tea $%.2f\n
                            """, coffeePrice, hotCocoPrice, espressoPrice, teaPrice);
                        userDrinkOption = scanner.nextInt();
                        switch (userDrinkOption) {
                            case 1 -> {
                                if (coffeeGrinds == 0) {
                                    System.out.println("Sorry, out of Coffee :(");
                                } else {
                                    System.out.printf("You picked Coffee. Please pay $%.2f\n", coffeePrice);
                                    userPaying = scanner.nextDouble();
                                    if (userPaying == coffeePrice) {
                                        System.out.println("Thank you! Enjoy your coffee! :)");
                                        coffeeGrinds -= 1;
                                        hotWater -= 1;
                                        balance -= userPaying;
                                    } else if (userPaying > coffeePrice) {
                                        System.out.println("Thank you! Enjoy your coffee! :)");
                                        coffeeGrinds -= 1;
                                        hotWater -= 1;
                                        balance += (userPaying - coffeePrice);
                                    } else if (userPaying < coffeePrice) {
                                        System.out.println("NOT SUFFICIENT FUNDS");
                                    }

                                }
                            }
                            case 2 -> {
                                if (cocoPowder == 0) {
                                    System.out.println("Sorry, out of Hot Chocolate :(");
                                } else {
                                    System.out.printf("You picked Hot Chocolate. Please pay $%.2f\n", hotCocoPrice);
                                    userPaying = scanner.nextDouble();
                                    if (userPaying == hotCocoPrice) {
                                        System.out.println("Thank you! Enjoy your Hot Chocolate! :)");
                                        cocoPowder -= 1;
                                        hotWater -= 1;
                                        balance -= userPaying;
                                    } else if (userPaying > hotCocoPrice) {
                                        System.out.println("Thank you! Enjoy your Hot Chocolate! :)");
                                        cocoPowder -= 1;
                                        hotWater -= 1;
                                        balance += (userPaying - hotCocoPrice);
                                    } else if (userPaying < hotCocoPrice) {
                                        System.out.println("NOT SUFFICIENT FUNDS");
                                    }

                                }
                            }
                            case 3 -> {
                                if (espressoShots == 0) {
                                    System.out.println("Sorry, out of Espresso :(");
                                } else {
                                    System.out.printf("You picked Espresso. Please pay $%.2f\n", espressoPrice);
                                    userPaying = scanner.nextDouble();
                                    if (userPaying == espressoPrice) {
                                        System.out.println("Thank you! Enjoy your Espresso! :)");
                                        espressoShots -= 1;
                                        hotWater -= 1;
                                        balance -= userPaying;
                                    } else if (userPaying > espressoPrice) {
                                        System.out.println("Thank you! Enjoy your Espresso! :)");
                                        espressoShots -= 1;
                                        hotWater -= 1;
                                        balance += (userPaying - espressoPrice);
                                    } else if (userPaying < espressoPrice) {
                                        System.out.println("NOT SUFFICIENT FUNDS");
                                    }

                                }
                            }
                            case 4 -> {
                                if (greenTeaBags == 0) {
                                    System.out.println("Sorry, out of Tea :(");
                                } else {
                                    System.out.printf("You picked Tea. Please pay $%.2f\n", teaPrice);
                                    userPaying = scanner.nextDouble();
                                    if (userPaying == teaPrice) {
                                        System.out.println("Thank you! Enjoy your Tea! :)");
                                        greenTeaBags -= 1;
                                        hotWater -= 1;
                                        balance -= userPaying;
                                    } else if (userPaying > teaPrice) {
                                        System.out.println("Thank you! Enjoy your Tea! :)");
                                        greenTeaBags -= 1;
                                        hotWater -= 1;
                                        balance += (userPaying - teaPrice);
                                    } else if (userPaying < teaPrice) {
                                        System.out.println("NOT SUFFICIENT FUNDS");
                                    }

                                }
                            }
                            default ->
                                System.out.println("Not a valid option!");
                        }
                    } else {
                        System.out.println("Out of hot water!");
                    }
                }
                case 3 -> {
                    System.out.printf("You have $%.2f\n", balance);
                    System.out.println("""

                            1] Add more money
                            2] Exit
                            """);
                    int balanceChoice = scanner.nextInt();
                    if (balanceChoice == 1) {
                        System.out.println("Add your deposit");
                        double depositAmount = scanner.nextDouble();
                        balance += depositAmount;
                    }
                }
                case 4 -> {
                    isRunning = false;
                    System.out.println("Thank you! Goodbye! :)");
                }
                default ->
                    System.out.println("Not a valid option!");
            }

        } while (isRunning);

        scanner.close();
    }

}
