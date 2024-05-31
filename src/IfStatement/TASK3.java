package IfStatement;

import java.util.Scanner;

public class TASK3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of house: ");
        int houseNumber = scanner.nextInt();
        if (houseNumber % 2 ==0){
            System.out.println("This is an even number of house!");
        } else {
            System.out.println("This is an odd number of house");
        }
    }
}
