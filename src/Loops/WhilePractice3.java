package Loops;

import java.util.Scanner;

public class WhilePractice3 {
    public static void main(String[] args) {
        /**
         * get a number from user to create a times tabke
         * user entry is >>6
         * 6 * 1 = 6
         * 6*2 = 12;
         * .....
         * 6*10 = 60
         */
        Scanner scanner = new Scanner(System.in);
        int entredNumber = scanner.nextInt();
        int multiplier = 1;


            while(multiplier <= 10){
                int result = multiplier * entredNumber;
                multiplier++;
                System.out.println(entredNumber + " * " + multiplier + " = "+ result);

            }
    }
}
