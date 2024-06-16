package Loops;

public class NestedForPractice4 {
    public static void main(String[] args) {
        /*
        ``
TASK4: print months for every year

from 2024 - 2026 print years and months

        2023 --> 1, 2, 3, 4, ...12
        2024 --> 1, 2, 3, 4, ...12
         */

        for (int year = 2024; year <= 2026; year++) {
            System.out.print(year + "--->");
            for (int month = 1; month <= 12; month++) {
                if (month == 1) {
                    System.out.print(month);
                } else {
                    System.out.print("," + month);
                }

            }

            System.out.println();
        }
    }
}
