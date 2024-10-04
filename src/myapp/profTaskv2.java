package myapp;

import java.io.Console;

public class profTaskv2{

    // Declare a constant inside the class so it can be used in every method
    public static final int CMD_POS = 0;

    public static void main (String[] args){
        float acc = 0;
        boolean stop = false;
        Console cons = System.console();
        while (!stop){
            
            //Read a line and trim it
            // ADD 1 2 3, BRK
            String input = cons.readLine("CMD>").trim();

            //splt up into terms
            String[] terms = input.split(" ");

            //ADD, BRK, ...
            String cmd = terms[CMD_POS];

            switch (cmd.toUpperCase()) {
                case "INIT":
                acc = 0;
                break;
                case "BRK":
                stop = true;
                break;
                case "SHOW":
                System.out.printf("> %.3f\n" ,acc);
                break;
                // ADD 5 6 7 9
                case "ADD":
                for (int idx=1; idx < terms.length; idx++){
                    acc+= Float.parseFloat(terms[idx]);
                }
                break;
                // SUB 5 6 7 9
                case "SUB":
                for (int idx=1; idx < terms.length; idx++){
                    acc -= Float.parseFloat(terms[idx]);
                }
                break;
                // MUL 5 6 7 9
                case "MUL":
                for (int idx=1; idx < terms.length; idx++){
                    acc *= Float.parseFloat(terms[idx]);
                }
                break;
                // DIV 4
                case "DIV":
                for (int idx=1; idx < terms.length; idx++){
                    acc /= Float.parseFloat(terms[idx]);
                }
                break;
            }
        }
    }
}