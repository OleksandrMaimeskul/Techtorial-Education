package Loops;

import java.util.Scanner;

public class ForPractice7 {
    public static void main(String[] args) {
        /*
        get a string from user to check if it is 'Palindrome' or not
        Ex: CIVIC, ana, ... LEVEL, REFER,....
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter yours String and we will check if it 'Polindrome or not: ");
        String enteredValue = scanner.nextLine();
        String modigiedVersion = "";

        for (int i = enteredValue.length() - 1; i >= 0; i--){
            modigiedVersion=modigiedVersion + enteredValue.charAt(i);
        }
        System.out.println(modigiedVersion);
        if (modigiedVersion.equals(enteredValue)){
            System.out.println("The string is PALINDROME");
        } else {
            System.out.println("Not a PAlindrome");
        }
        System.out.println("====================");


    }

}
