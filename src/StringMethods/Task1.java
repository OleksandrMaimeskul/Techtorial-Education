package StringMethods;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /**
         * TASK: get a string from User via scanner and:
         * -print:
         *     - first char
         *     - last char
         *     - index of second matching letter 'c'
         *     - lenght of string
         *     - index of x
         *     - middle char
         *
         */
        Scanner scanner = new Scanner(System.in);
        String textEntered = scanner.nextLine();
        char first = textEntered.charAt('0');
        System.out.println("First Char " + first);
        int length = textEntered.length();
        char lastChar = textEntered.charAt(length - 1);
        System.out.println("Last Char " + lastChar);

        // textEntered.indexOf ('c')
        int secondCIndex = textEntered.indexOf('c', textEntered.indexOf('c') + 1);
        System.out.println("index of second matching letter 'c' " + secondCIndex) ;
        System.out.println("length of string " + textEntered.length());
        int x = textEntered.indexOf('x');
        System.out.println("index of x " + x);

        System.out.println("middle char " + textEntered.charAt(textEntered.length()/2));



    }
}
