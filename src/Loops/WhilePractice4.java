package Loops;

import java.util.Scanner;

public class WhilePractice4 {
    public static void main(String[] args) {

        /**
         * take a string value from user
         *
         * print out each letter from given string  one by one
         *
         * "It makes sense"
         *
         * .. green..
         * t
         * ..green..
         *
         * ..green..
         *
         * .....
         *
         *
         */
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int index = 0;
        while (index<s.length()){
            System.out.println(s.charAt(index) != ' ');
            System.out.println(".......");
            index++;

        }
        System.out.println("+++++++++++++++");
        System.out.println("give me a new STRING");
        s = scanner.nextLine().replace("\\s ", " ");
        index = 0;
        while(index < s.length());
        index++;






    }
}
