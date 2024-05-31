package IfStatement;

import java.util.Scanner;

public class TASK5 {
    public static void main(String[] args) {
        /*
        pick a number between o and 15
        if number is 0 t0 5 >>  " your number is in range of 0 to 5";

        6 to 10 >>             6 to 10
        11 to 15               11 to 15
        if the number is any other number >> OUT OF RANGE
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please pick number from 0 to 15");
        int enteredNumber = scanner.nextInt();
        if(enteredNumber>=0 && enteredNumber <=5){
            System.out.println("your number is in range of 0 to 5");
        } else if (enteredNumber>=6 && enteredNumber <=10){
            System.out.println("your number is in range of 6 to 10");
        }else if (enteredNumber>=11 && enteredNumber <=15){
            System.out.println("your number is in range of 11 to 15");
        }else {
            System.out.println("Out of Range!");
        }
    }
}
