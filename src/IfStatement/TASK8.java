package IfStatement;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class TASK8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your city: ");
        String enteredCity = scanner.nextLine();
        String chicago = "chicago";
        String school = "techtorial";


        if (enteredCity.equalsIgnoreCase(chicago)){
            System.out.println("Which school are you going?");
            String enteredSchool = scanner.nextLine();
            if(enteredSchool.equalsIgnoreCase(school)){
                System.out.println("Congratulations!");
            } else {
                System.out.println("Please visit us, since you are in Chicago");
            }
        } else {
            System.out.println("Please travel to Chicago and apply for our school");
        }
    }
}
