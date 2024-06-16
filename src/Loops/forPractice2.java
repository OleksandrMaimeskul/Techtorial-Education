package Loops;

import java.util.Scanner;

public class forPractice2 {
    public static void main(String[] args) {

        /**
         * find sum of number in given
         * 10 to 15 >>  10 + 11 + 12 + 13 + 14 + 15 >> 75
         */

        int sum = 0;
        for(int n = 10, n2= 15; n <= n2 ; n++){
            sum = sum   + n;
            System.out.println(sum);
        }
    }
}
