package IfStatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TASK7 {
    public static void main(String[] args) {
        /**
         * Retirement
         * calculcate age of person based on his/her DOB
         * 65 and up >> good >> can retire
         * 55-64 >>   ok > need to pay 20k
         * or >> you have to wait for another 30 years.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your DOB year");
        int year = scanner.nextInt();
        int age = 2024-year;
        if (age>=65) {
            System.out.println("You can Retire");
        } else if (age >= 55 && age <=64) {
            System.out.println("You need to Pay 20k to get retired! ");
        } else {
            System.out.println("You have to wait another 30 years");
        }
    }
}
