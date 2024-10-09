package myapp;

import java.io.Console;
import java.util.*;

public class WorkshopMain {
    
    public static final int CMD_POS =0;

    public static void main (String[] args){
        boolean stop =false;
        Console cons =System.console();
        ShoppingCart shoppingCart = new ShoppingCart();

        System.out.println("Welcome to your shopping cart");

        while(!stop){

            String input = cons.readLine("> ").trim();

            String[] terms = input.split(" ");

            String cmd = terms[CMD_POS];

            switch(cmd.toUpperCase()){
                case "LIST":
                shoppingCart.listItems();
                break;

                case "STOP":
                stop = true;
                break;

                case "ADD":
                for (int idx =1; idx < terms.length; idx++){
                    shoppingCart.addItems(terms[idx]);
                 }
                break;

                case "DELETE":
                int itemIndexRemove = Integer.parseInt(terms[1]);
                shoppingCart.removeItems(itemIndexRemove);
                break;

                default:
                System.out.println("Unknown command. Please use 'list', 'add', 'delete', or 'stop'.");
                break;
            }

        }

    }

}
