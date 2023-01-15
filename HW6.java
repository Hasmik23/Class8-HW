package class8HW;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        /* Write a program to ask a user to enter item they want to buy and the price of that item.
        Every time user enters money accumulate the amount and tell the user how much is left to pay off.
        If user give more money program should return a change.
         Whenever a user done with payments program should say "Thank you for shopping!"*/


       Scanner input=new Scanner(System.in);
        System.out.println("Please enter an item");
        String item=input.nextLine();
        System.out.println("Please enter the item price");
        int price=input.nextInt();

        int amountPaid=0;

        if (amountPaid < price) {
            amountPaid=input.nextInt();
            System.out.println("Please enter the amount you want to pay");
            int debt = price - amountPaid;
            System.out.println("&" + debt + " left to pay for your " + item);
        }else {
            System.out.println("You have paid off. Thank you for shopping");
            int change = price - amountPaid;
            if (change > 0){
                System.out.println("You change is &"+change);
            }
        }
    }
}
