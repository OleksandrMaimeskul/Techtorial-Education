package SwitchPractice;

import java.util.Scanner;

public class TASK2_Calculator {
    public static void main(String[] args) {
        /**
         * get two integer numbers from user
         * and
         * get a name of match operations >> add, divide, subtract, multiply
         *
         * base on user selected operation, show the result;
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1st integer value: ");
        int value = scanner.nextInt();
        System.out.println("Please enter 2nd integer value: ");
        int value2 = scanner.nextInt();

        System.out.println("Choose math operation? \n+\n-\n'/'\n*");
        String operation = scanner.next().toLowerCase();

        switch (operation) {
            case "-":
                System.out.println("Substracting>>>>" + (value - value2));
                if(value>= value2){
                    System.out.println("Substracting>>>>" + (value - value2));
                } else {
                    System.out.println("Substracting>>>>" + (value2 - value));
                }
                break;
            case "*":
                System.out.println("Multiply>>>>" + value * value2);
                break;
            case "/":
                System.out.println("Divide>>>>" + value / value2);
                break;
            case "+":
                System.out.println("Add>>>>>" + value + value2);
                break;
            default:
                System.out.println("Wrong operation!");
        }

    }
}
