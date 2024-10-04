package myapp;

import java.io.Console;

public class Task {
    public static void main(String[] args){
        Console cons = System.console();

        float value =0;
    
        while (value>=0){
            String input = cons.readLine("CMD>>");
            String answer = input.toLowerCase();

            if (answer.equals("init")){
                value = 0;
            }
            if(answer.equals("add")){
                value +=3.14;
            } 
            if (answer.equals("mul")){
                value *=4;
            }
            if (answer.equals("show")){
                System.out.println("Current number is " + value);
            }
            if (answer.equals("div")){
                value /=7;
            }
            if (answer.equals("break")){
                break;
            }
        }
    }

}