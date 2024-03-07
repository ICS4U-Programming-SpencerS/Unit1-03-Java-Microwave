package com.example;

import java.util.Scanner;

/**
 * Einstein's equation calculator.
 *
 * @author Spencer S.
 * @version 1.0
 * @since 2024-Feb-26
 */

public final class Microwave {
    /** Stops random instantiation from happening. */
    private Microwave() {
        // Prevents instantiation.
    }

    /**
    * Main Code base.
    *
    * @param args Command line arguments (not used).
    */
    public static void main(final String[] args) {
        // Prep scanner for usage
        final Scanner in = new Scanner(System.in);
        // constants for later in code, needed for calculations
        final int PIZZA_TIME = 45;
        final int SUB_TIME = 60;
        final int SOUP_TIME = 105;

        // Opening message and option selection.
        System.out.println("Enter the food item you wish to microwave!");
        System.out.println("Pizza = 1, Sub = 2, Soup = 3");
        final String foodString = in.nextLine();

        try {
            // Casting
            final Integer foodInt = Integer.parseInt(foodString);
            // Amount option selection
            if (foodInt <= 0 || foodInt > 3) {
                System.out.println("Input must be 1, 2, or 3. Nothing else!");
            }
            else {
                // asks for amount that we want to microwave.
                System.out.println("Enter the amount you wish to microwave!");
                // input line
                final String amountString = in.nextLine();
                try {
                    // casts amount to a int
                    final Integer amountInt = Integer.parseInt(amountString);
                    if (amountInt <= 0 || amountInt > 3) {
                        // checks if number is 0 or less
                        System.out.println("Food amount must be 1, 2, 3!");
                    } else {
                        // switch cases for calculations
                        switch (foodInt) {
                            // case 1 for pizza calculations
                            case 1:
                                final int pizzaCalculated = PIZZA_TIME * amountInt;
                                final int minutesPizza = (pizzaCalculated / 60);
                                final int secondPizza = pizzaCalculated - (minutesPizza * 60);
                                System.out.print("One pizza takes " + minutesPizza + " m's");
                                System.out.print(" and " + secondPizza + " s's");
                                System.out.println();
                                break;

                            // case 2 for sub calculations
                            case 2:
                                final int subCalculated = SUB_TIME * amountInt;
                                final int minutesSub = (subCalculated / 60);
                                final int secondSub = subCalculated - (minutesSub * 60);
                                System.out.print("One sub takes " + minutesSub + "m's");
                                System.out.print(" and " + secondSub + "s's");
                                System.out.println();
                                break;

                            // case 3 for soup calculations
                            case 3:
                                final int soupCalculated = SOUP_TIME * amountInt;
                                final int minutesSoup = (soupCalculated / 60);
                                final int secondSoup = soupCalculated - (minutesSoup * 60);
                                System.out.print("One soup takes ");
                                System.out.print(minutesSoup + "m's.");
                                System.out.print(" and " + secondSoup + "s's.");
                                System.out.println();
                                break;
                            
                            // unused default case, not needed
                            default:
                                break;
                        }
                    }
                    // try catch for food amount input
                } catch (NumberFormatException error) {
                    System.out.println("Amount needs to be 1, 2, or 3.");
                }
            }
            // try catch for food type input
        } catch (NumberFormatException error) {
            System.out.println("Input must be 1, 2, or 3.");
        }
        // Closes the scanner.
        in.close();
    }
}
