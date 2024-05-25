package String_Scanne_Practice;

import java.util.Scanner;

public class ScannerPractice1 {
    public static void main(String[] args) {

        System.out.println("Please enter name");
        Scanner dataTaker = new Scanner(System.in);
        String s1 = dataTaker.nextLine();// >> it will read entire line from console

         /*
         get last name of user by using scanner
         store it into a new variable
         contact first and last name and
         print as full name >> name + last name >> David Smith
          */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your lastname: ");
        String s = scanner.nextLine();
        System.out.println(s1 + " " + s + " - Yours full name");

        System.out.println("What is your city? " + s1 + " " + s);
        String s2 = dataTaker.nextLine(); // next function will read string to very first space
        // New York, so will be only "New"
        System.out.println("Great, so you is " + s1 + " " + s + " from the city " + s2);

        /*
         take age of user
         tell him / her new age in 20 years
         25>> " your age will be ...45... in 20 years
         */


        System.out.println("Please enter your age: ");
        int currentAge = dataTaker.nextInt();
        int newAge = currentAge + 20;
        System.out.println("your age will be " + newAge + " in 20 years");



    }
}
