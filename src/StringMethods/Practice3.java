package StringMethods;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        String drink = "coffee";
        //equalsIgnoreCase ();
        System.out.println(drink.equalsIgnoreCase("CoffEE"));
        String cookie = "coffEe";
        System.out.println(cookie.equals(drink)); // False
        System.out.println(drink.toLowerCase().equals(cookie.toLowerCase())); // True
        System.out.println(cookie.equalsIgnoreCase(drink)); // True

        System.out.println("--------------------------");

        //substring()
        // it will take one or two index numbers, it will return partial string from given index

        // techtorial >> substring (indexNumber) >> substring(4) >> torial
        // return type of the substring is 'string'
        String school = "Techtorial";
        // cutting string from 't'
        String part1 = school.substring(4);
        System.out.println(part1);

        String part2 = school.substring(school.indexOf('t'));
        System.out.println("Part2: " + part2);


        // want to cut only last 2 chars from "Techtorial" >> al
        String substring = school.substring(school.length()-2);
        System.out.println(substring);

        //i want to cut given string from middle part
        // substracting(IndexNumber1, IndexNumber2) >> begining and ending index;
        String part3 = school.substring(4,6);
        System.out.println(part3);
        System.out.println(part3.concat("VACATION is after course done!!"));
        System.out.println("--------------------------");
        // Get a string value from user as his last name >> First and Lastname
        // >>Jphn Smith
        // print only Last name

        String name4 = "John Smith";
        System.out.println(name4.substring(5));
        System.out.println(name4.substring(name4.length()-5));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Full Name as \"John Smith\" ");
        String fullName = scanner.nextLine();
        String substring1 = fullName.substring(fullName.indexOf(" ") + 1);
        System.out.println("Last name is " + substring1);


    }
}
