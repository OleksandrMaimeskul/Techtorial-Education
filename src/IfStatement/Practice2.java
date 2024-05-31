package IfStatement;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        // if the day name is Thursday >> It is the best day, otherwise it will regular day
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter day of the week");
        String str = scanner.nextLine();
        String bestDay = "Thursday";
//        String str = "Monday", bestDay = "Thursday";
        if (str.equals(bestDay)) {
            System.out.println("It is the best day!");
        } else {
            System.out.println("It is a regular day!");
        }

    }

}
