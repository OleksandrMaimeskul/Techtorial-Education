package ArraysPractice.Online;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 10: ");
        int enteredNumber = scanner.nextInt();


        if (enteredNumber >= 1 && enteredNumber <= 10) {
            String[] result = new String[enteredNumber];

            for (int i = enteredNumber; i >= 1; i--) {
                String line = "";
                for (int j = 1; j <= i; j++) {
                    line+= i;
                }
                result[enteredNumber - i] = line;
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
