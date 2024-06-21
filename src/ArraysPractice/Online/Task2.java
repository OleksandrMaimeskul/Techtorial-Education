package ArraysPractice.Online;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 10: ");
        int enteredNumber = scanner.nextInt();
        scanner.nextLine();

        if (enteredNumber >= 1 && enteredNumber <= 10) {
            String[] result = new String[enteredNumber];

            for (int i = 1; i <= enteredNumber; i++) {
                String line = "";
                for (int j = 1; j <= i; j++) {
                    line += i;
                }
                result[i - 1] = line;
            }

            for (String s : result) {
                System.out.println(s);
            }
        } else {
            System.out.println("You are out of range.");
        }

        scanner.close();
    }
}
