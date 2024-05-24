package String_Scanne_Practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        String name = "Techtorial";
        System.out.println(name);
        System.out.println(name + " Academy");
        System.out.println(name + " Academy" + 123 + 321);

        name = name + " ACADEMY";
        System.out.println(name);
        String day = "Thursday";
        name = name + " " + day;
        System.out.println(name);
        System.out.println(day);

        day = day + 4050;
        System.out.println(day);
        System.out.println("=============");

        day = 6070 + 100 + day;
        System.out.println(day);
        System.out.println("=============");
        System.out.println(name.charAt(0));


        String str = "Test";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");

        String valueFromConsole = scanner.nextLine();
        System.out.println(valueFromConsole + "<<<<<<<<");



    }
}
