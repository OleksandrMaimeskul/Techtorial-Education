package SwitchPractice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number for your day option");

        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("The number of the day is Monday ");
                break;
            case 2:
                System.out.println("The number of the day is Tuesday ");
                break;
            case 3:
                System.out.println("The number of the day is Wednesday ");
                break;
            case 4:
                System.out.println("The number of the day is Thursday ");
                break;
            case 5:
                System.out.println("The number of the day is Friday ");
                break;
            default:
                System.out.println("Out of day!");
        }
    }
}
