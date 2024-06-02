package IfStatement;

import java.util.Scanner;

public class ExampleScanner {
    public static void main(String[] args) {
/*
IL will pay 10% tax
IL and zipcodes 10101 , 10102 will pay extra 5% county tax

All other states will pay only 7% tax
-in other states:
    if you have electrical car you can get 7K tax credit and deduct it from your income

if you are making $65350 per year, calculate the net income after tax deductions for each case.
And, let the user know about tax amount
 */
        double income = 100_000, tax;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your State");
        String state = scanner.nextLine();
        if (state.equalsIgnoreCase("IL")) {

            System.out.println("What is your zipcode?");
            int zipcode = scanner.nextInt();

            if (zipcode == 10101 || zipcode == 10102) {
                // you are paying 10% IL + 5% County tax
                tax = income * 0.15;
                income -= tax;

                System.out.println("Your net income after tax is : " + income);
                System.out.println("You paid $" + tax + " tax");

            } else {
                tax = income * 0.10;
                income -= tax;

                System.out.println("Your net income after tax is : " + income);
                System.out.println("You paid $" + tax + " tax");

            }


        } else {

            // other states>> directly deduct 7K from income if you have electrical car
            // tax percentage is 7%

            System.out.println("Do you have Electrical car? yes/no");
            String havingCar = scanner.nextLine();
            if (havingCar.equalsIgnoreCase("yes")) {

                income -= 7000;
                tax = income * 0.07;
                income -= tax;

                System.out.println("Your net income after tax is : " + (income + 7000));
                System.out.println("You paid $" + tax + " tax");


            } else {
                tax = income * 0.07;
                income -= tax;

                System.out.println("Your net income after tax is : " + income);
                System.out.println("You paid $" + tax + " tax");

            }


        }


    }
}