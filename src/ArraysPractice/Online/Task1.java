package ArraysPractice.Online;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter minimum number between 0 and 120, which can devided by 3 and 11: ");
        int min = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter maximum number between 0 and 120, which can devided by 3 and 11: ");
        int max = scanner.nextInt();
        scanner.nextLine();
        do {
            if ((min > 0 && min < 120) && (max > 0 && max < 120)) {
                if ((min % 3 == 0 && max % 3 == 0) && (max % 11 == 0 && min % 11 == 0)) {
                    System.out.println("Okay, we can proceed to next step, there is a sum: " + (min + max));
                    break;
                } else {
                    System.out.println("Wrong! Try to enter one more minimum number from 0 to 120, which can devided by 3 and 11: ");
                    min = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Try to enter one more time maximum number from 0 to 120, which can devided by 3 and 11: ");
                    max = scanner.nextInt();
                    scanner.nextLine();
                }
            } else {
                System.out.println("Out of Range!");
                System.out.println("Try to enter one more minimum number from 0 to 120, which can devided by 3 and 11: ");
                min = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Try to enter one more time maximum number from 0 to 120, which can devided by 3 and 11: ");
                max = scanner.nextInt();
                scanner.nextLine();
            }
        } while ((min > 0 && min < 120) && (max > 0 && max < 120));
        scanner.close();
    }
}

