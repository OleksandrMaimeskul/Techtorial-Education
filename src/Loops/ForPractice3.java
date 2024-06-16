package Loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ForPractice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter any word:");
//        String season = scanner.nextLine();
//        int count = 0;
//        //by using for loop, print out letter of seasong last to first;
//        // Summer
//        // r e m m u S
//
//        for (int i = season.length() - 1; i >= 0; i--) {
//            System.out.print(season.charAt(i));
//        }
//        // by using for loop, print out only letter'm' from season "*m*"
//
//        for (int i = 0; i < season.length(); i++) {
//            if (season.charAt(i) == 'm') {
//                System.out.println("*" + season.charAt(i) + "*");
//            }
//
//
//        }
//        System.out.println("--------");
//        // by using for loop, count numbers of letter 'm' in season
//
//        for (int i = 0; i < season.length(); i++) {
//            if (season.charAt(i) == 'm') {
//                count++;
//            }
//            System.out.println(count);
//        }

        // by using for loop, print out Uppercase Alphabet separated by comma
        // A,B,C,D,.... X,Y,Z

        for (char letter = 'A'; letter <= 'Z'  ; letter++) {
            System.out.print(letter + ",");

        }
    }
}
