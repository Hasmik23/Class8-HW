package class8HW;

public class HW5 {
    public static void main(String[] args) {
        /* Print the following pattern:
         *

         *

         *
         **
         *
         **
         *

         */


        for (int i = 0; i <= 9; i++) {
            if (i % 2 != 0) {
                System.out.println("*");
            } else if (i == 2 || i == 4) {
                System.out.println();
            } else {
                System.out.println("**");

            }

        }
    }
}


