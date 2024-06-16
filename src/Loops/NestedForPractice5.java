package Loops;

public class NestedForPractice5 {
    public static void main(String[] args) {
        /*
        \2024 --> 1- Jan, 2 - Feb
         */

        for (int year = 2024; year <= 2026; year++) {
            System.out.print(year + "--->");
            for (int month = 1; month <= 12; month++) {
                switch (month) {
                    case 1:
                        System.out.print(month + "-JAN,");
                        break;
                    case 2:
                        System.out.print(month + "-FEB,");
                        break;
                    case 3:
                        System.out.print(month + "-MAR,");
                        break;
                    case 4:
                        System.out.print(month + "-APR,");
                        break;
                    case 5:
                        System.out.print(month + "-MAY,");
                        break;
                    case 6:
                        System.out.print(month + "-JUN,");
                        break;
                    case 7:
                        System.out.print(month + "-JUL,");
                        break;
                    case 8:
                        System.out.print(month + "-AUG,");
                        break;
                    case 9:
                        System.out.print(month + "-SEP,");
                        break;
                    case 10:
                        System.out.print(month + "-OCT,");
                        break;
                    case 11:
                        System.out.print(month + "-NOV,");
                        break;
                    case 12:
                        System.out.print(month + "-DEC.");
                        break;
                }
            }
            System.out.println();
        }
    }
}