package Loops;

import java.util.Scanner;

public class doWhilePractice4 {
    public static void main(String[] args) {
//        String str = "Th5*k@ye4-3a";
        /*
        count numbers of letters
        count number of digits
        count number of other symbols in given string
         */
        Scanner scanner = new Scanner(System.in);
        String enteredValue = scanner.nextLine();
        int i = 0;
        int letterCount = 0;
        int symbolsCount = 0;
        int digitCounter = 0;
        do {
            if (enteredValue.charAt(i) >= 'A' && enteredValue.charAt(i) <= 'Z' || enteredValue.charAt(i) >= 'a' &&
                    enteredValue.charAt(i) <= 'z') {
                letterCount++;
            } else if (enteredValue.charAt(i) >= 0 && enteredValue.charAt(i) <= 9) {
                digitCounter++;
            } else {
                symbolsCount++;
            }
            i++;
        } while (i < enteredValue.length());

        System.out.println("There are " + letterCount + " letters in the string");
        System.out.println("There are " + digitCounter + " digits in the string");
        System.out.println("There are " + symbolsCount + " symbols in the string");

    }
}
