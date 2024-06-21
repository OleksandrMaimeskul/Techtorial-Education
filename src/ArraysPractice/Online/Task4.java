package ArraysPractice.Online;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter one string value: ");
        String entered = scanner.nextLine();
        boolean[] seen = new boolean[256];
        String value = "";

        for (int i = 0; i < entered.length(); i++) {
            char currentChar = entered.charAt(i);
            if (!seen[currentChar]) {
                seen[currentChar] = true;
                value += currentChar;
            }

        }
        System.out.println(value);
    }
}
