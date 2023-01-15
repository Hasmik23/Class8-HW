package class8HW;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        /* Create a program that reads a range of integers(start and end points,
         provided by a user and then from range prints the sum of the even and odd integers. */


        int evenSum = 0;
        int oddSum = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter start number");
        int num1 = input.nextInt();
        System.out.println("Please enter end number");
        int num2 = input.nextInt();

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }

        }
        System.out.println("Sum of even numbers= " + evenSum);
        System.out.println("Sum of odd numbers= " + oddSum);

    }
}















       /* do
        {
            System.out.print("Enter any number ");
            number = console.next().charAt(0);

            if( number % 2 == 0)
            {
                even += number;
            }
            else
            {
                odd += number;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        }while(choice=='y' || choice == 'Y');

        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd); */














