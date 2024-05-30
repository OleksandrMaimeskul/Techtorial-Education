package IfStatement;

import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number from 1 to 5: ");
        int numberChoose = scanner.nextInt();
        if (numberChoose == 1) {
            System.out.println("Your day is Monday");
        } else if (numberChoose == 2) {
            System.out.println("Your day is Tuesday");
        } else if (numberChoose == 3) {
            System.out.println("Your day is Wednesday");
        } else if (numberChoose == 4) {
            System.out.println("Your day is Thursday");
        } else if (numberChoose == 5) {
            System.out.println("Your day is Friday");
            // print >> No matching day for your entry when user enters any number other than 1 to 5
        } else if (numberChoose > 5 || numberChoose < 1)
            System.out.println("No matching day for your entry ");
    }
}