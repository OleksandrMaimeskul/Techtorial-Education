package StringMethods;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        TASK: Ask user to enter a String value which should have space at the beginning or end
    - Replace all letter 'a's with single '*' and letter 'e's with double '**',
    - change all string value to UPPERCASE
    - Find index of First '*'
    - Multiply above index value of '*' by 10 and
    - Print out the result as number
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String value which should have space at the beginning or end: ");
        String stringValue = scanner.nextLine();
        stringValue = stringValue.replace('a', '*').replace("e", "**").toUpperCase();
        int substring = stringValue.indexOf('*')*10;
        System.out.println(stringValue);
        System.out.println(substring);
    }
}
