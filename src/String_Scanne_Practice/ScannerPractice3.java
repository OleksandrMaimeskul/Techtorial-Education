package String_Scanne_Practice;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        //goal is to read a char from string
        // goal is to read/take a char tru scanner
        String cookie = "Chocolate";
        // indexing for string >> position for chars
        // pick first 'c' from cookie variable

        char letter1 = cookie.charAt(0);
        System.out.println(letter1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your favorite drink... ");
        //want to take first letter from this favorite drink

        char letter1_ = scanner.nextLine().charAt(0);
        System.out.println("Your first letter of the drink is >>> " + letter1_);

        // boolean from scanner

        System.out.println("give us a boolean value ");
        boolean b = scanner.nextBoolean();
        System.out.println("Boolean is: " + b);

    }
}
