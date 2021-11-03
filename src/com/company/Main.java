package com.company;

import java.util.Scanner;
import java.util.*;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("The choices of available pizza are:");
        System.out.println("");
        System.out.println("- small");
        System.out.println("- medium");
        System.out.println("- large");
        System.out.println("");

        System.out.println("Which size pizza would you like");
        String pizzaSize = input.next();

        double total = 0;


        if (pizzaSize.equalsIgnoreCase("small")) {
            total = (7.99);

        } else if (pizzaSize.equalsIgnoreCase("medium")) {
            total = (10.99);

        } else if (pizzaSize.equalsIgnoreCase("large")) {
            total = (13.99);

        }


        System.out.println("You have two free toppings included, please choose them");
        System.out.println("");
        System.out.println("Choose Your first topping:");
        String topping1 = input.next();
        System.out.println("Now Choose your second topping");
        String topping2 = input.next();

        System.out.println("You may have more topping, but it will cost you £1.25 extra per topping");

        ArrayList<String> toppings = new ArrayList<>();

        boolean moretoppings = true;
        while (moretoppings) {
            System.out.println("Would you like and extra topping");
            String ans = input.next();

            if (ans.equalsIgnoreCase("yes")) {
                System.out.println("Choose Your extra topping:");
                toppings.add(input.next());
                total = total + 1.25;
                System.out.println("You ordered 1 " + pizzaSize + " pizza with " + topping1 + " and " + topping2 + " with extra: " );
                for (int i = 0; i < toppings.size(); i++) {
                    System.out.print("" + toppings.get(i) + "");
                }
                System.out.println("");
                System.out.println("Your price is £" + total);


            } else if (ans.equalsIgnoreCase("no")) {
                System.out.println("no extra topping selected");
                System.out.println("");
                System.out.println("You ordered 1 " + pizzaSize + " pizza with " + topping1 + " and " + topping2);
                System.out.println("Your price is £" + total);
                break;
            }
        }


    }
}
