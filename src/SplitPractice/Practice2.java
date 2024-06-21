package SplitPractice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        // get birthdate from user in following format >>>> 06-19-2024

        // make sure the day if the birtdate and today's day is matching, and send a message to user

        // " Happy Birthday!"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your birthday in following format : mm-dd-yyyy");

        String userBirthdayDate = scanner.nextLine();

        String [] exactMatch = userBirthdayDate.split("-");

        if (exactMatch[0].equalsIgnoreCase("06")&&exactMatch[1].equalsIgnoreCase("19")){
            System.out.println("Happy Birthday!");
            /*
            find a way to get today's date from system
            convert that to String
            and compare that with user entry to do same for birthday message
             */

        }
    }
}
