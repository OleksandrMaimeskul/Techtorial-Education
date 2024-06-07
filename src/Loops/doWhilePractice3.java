package Loops;

import java.util.Scanner;

public class doWhilePractice3 {
    public static void main(String[] args) {
        /**
         * get a integer value from user to make a star tree for:
         * >>6
         * *
         * **
         * ***
         * ****
         * *****
         * *****
         *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter an inger value: ");
        int enteredValue = scanner.nextInt();
        int count = 0;
        String star = "*";
        do {
            System.out.println(star);
            star+="*";
            count++;
        } while (count < enteredValue);
    }
}
