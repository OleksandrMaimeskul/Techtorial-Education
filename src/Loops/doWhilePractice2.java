package Loops;

import java.util.Scanner;

public class doWhilePractice2 {
    //find the total of even numbers in a given range by using do-wgile loop
    // 11,12,13,14....20
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter one number ");
        int number = scanner.nextInt();
        System.out.println("Please enter second number ");
        int number2 = scanner.nextInt();
        int total = 0;
        do {
            if (number % 2 == 0) {
                total += number;

            }
            number++;

        } while (number <= number2);

        System.out.println("You summary is " + total);
    }

}

