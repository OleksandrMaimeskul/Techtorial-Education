package IfStatement;

import java.util.Scanner;

public class TASK4 {
    public static void main(String[] args) {
        /*
        user buys 3 items
        get prices of those 3 items from user
        if the total amount of those items 100 or more, user will get 20% discount
        otherwise user will get only 5% discount
        in both case, tax percent on total amount is 10%
        Find out:
        final payment including tax and discount amount for either case
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter prices for 3 items:");
        double enterPrice = scanner.nextDouble();
        double enterPrice2 = scanner.nextDouble();
        double enterPrice3 = scanner.nextDouble();
        double summary = enterPrice + enterPrice2 + enterPrice3;
        if (summary > 100) {
            double with20Percent = (summary - (summary * 0.2)* 0.1);
            System.out.println("You will get 20% discount.So total amount to pay with tax included will be: "
                    + with20Percent);
        } else if (summary <= 100) {
            double with5Percent = ((summary - (summary * 0.05))* 0.1);
            ;
            System.out.println("You will get 5% discount.So total amount to pay with tax included will be: "
                    + with5Percent);
            ;
        }
    }
}

