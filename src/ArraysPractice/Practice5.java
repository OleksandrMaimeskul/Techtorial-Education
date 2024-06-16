package ArraysPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        /**
         * ask user to tell ypu how many student names they want to a store
         *
         * get each name from user and store them into an array
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many student names they want to a store: ");
        int recordCount = scanner.nextInt();
        String[] names = new String[recordCount];
        scanner.nextLine();
        for (int i = 0; i < recordCount; i++) {
            System.out.println("Please enter " + (i + 1 )+ "student name:");
            String name = scanner.nextLine();
            names[i] = name;

        }
        System.out.println(Arrays.toString(names));

    }

}
