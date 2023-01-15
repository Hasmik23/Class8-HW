package class8HW;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        /* Create a program that will be asking user to apply for a credit card 10 times.
        As soon you get an “yes” from a user program should stop asking. */


       Scanner input=new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Do you apply for credit card");
            String apply=input.next();
           if(apply.equalsIgnoreCase("Yes")) {
               System.out.println("Thank you for applying");
               break;
           }else if (i == 10){
               System.out.println("Thank you");
           }


            }

        }
    }








       // for (int i = 1; i <= 10; i++){




