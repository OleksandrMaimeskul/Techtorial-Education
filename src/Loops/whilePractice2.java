package Loops;

import java.util.Scanner;

public class whilePractice2 {
    public static void main(String[] args) {

        /**
         * ask user to give you an ineteger number
         * find divisors of given number
         * "..1.. is divisor of 10"
         * "..2.. is divisor of 10"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to find difisor of: ");
        int number = scanner.nextInt();
        int divisor = 1;
        while (divisor<=number){
            if(number % divisor == 0){
                System.out.println(divisor +" is divisor of " + number);
            }
            divisor++;
        }
    }
}
