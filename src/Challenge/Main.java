package Challenge;

import java.util.*;
import java.io.*;

public class Main {

    private static final int CMD_POS = 0;

    public static void main(String[] args) {

        Console cons = System.console();
        boolean stop = false;
        ShoppingCart shoppingCart = new ShoppingCart();

        System.out.println("Welcome to your Shopping Cart");

        while (!stop) {
            String input = cons.readLine(">").trim();
            String[] terms = input.split(" ");

            switch (terms[CMD_POS].toUpperCase()) {

                case "STOP":
                    stop = true;
                    break;

                case "LIST":
                    shoppingCart.listItems();
                    break;

                case "ADD":
                    for (int i = 1; i < terms.length; i++) {
                        shoppingCart.addItems(terms[i]);
                    }
                    break;

                case "DELETE":

                    int removedIndex = Integer.parseInt(terms[1]);
                    shoppingCart.deleteItems(removedIndex);
                    break;

                default:
                    System.out.println("Unknown command. Please use ADD, STOP, DELETE or LIST only");
            }

        }

    }

}
