package Loops;

import java.util.Scanner;

public class whilePractise5 {
    public static void main(String[] args) {
        /**
         * get to numbers from user an make sure user five smaller number first
         * and larger number as next
         * >> find total of number un that range
         * first>> 10 second>>15
         * 10+11+12+13+14+15=>75
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter smaller amd bigger numbers: ");
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();
        int bucket = 0;

        while (number<=number2){

            bucket+= number;
            number++;
        }
        System.out.println("You summary is " + bucket);
    }
}
