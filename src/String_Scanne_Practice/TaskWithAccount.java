package String_Scanne_Practice;

import java.util.Scanner;

public class TaskWithAccount {
    public static void main(String[] args) {
        double accountMoney = 200;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any amount of paycheck (one per one time) :");
        double enteredAmount = scanner.nextDouble();
        accountMoney += enteredAmount;
        System.out.println("You have on account: " + accountMoney);
        double enteredAmount2 = scanner.nextDouble();
        accountMoney += enteredAmount2;
        System.out.println("You have on account: " + accountMoney);
        double enteredAmount3 = scanner.nextDouble();
        accountMoney += enteredAmount3;
        System.out.println("You have on account: " + accountMoney);

        double phonePrice = 599;
        double headphonePrice = 299;
        double finalAmount = accountMoney - phonePrice - headphonePrice;
        System.out.println("Final amount on the account after buying a phone and headphone:" +
                String.format("%.2f",finalAmount));

    }
}
