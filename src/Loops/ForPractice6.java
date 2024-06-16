package Loops;

import java.util.Scanner;

public class ForPractice6 {
    public static void main(String[] args) {
        //find out if a given number by user is a 'PERFECT' number or not
        // PERFECT number is : when add divisiors of a number and th sum is equal to number itself
        // that number is calle a perfect number

        // 8 >> dividors of 8 >> 1,2,4 >> 7 7==8 >> 8 is not a perfect number
        // 6>>         6 >> 1,2,3,>6  6== 6>> 6 is a perfect number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number: ");
        int number = scanner.nextInt();
        int bucket = 0;
        for (int divisor = 1; divisor < number; divisor++) {
            if (number % divisor == 0) {
                // this is diviser that you are looking for
                bucket += divisor;
            }
        }
        if (number == bucket)System.out.println(number + " Perfect Number");
         else System.out.println(number +  " 4Number is not a perfect number");
        }

    }

