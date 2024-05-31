package IfStatement;

import java.util.Scanner;

public class TASK6 {
    public static void main(String[] args) {
        //find out if your favorite number is positive, negative or neither
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int favoriteNumber = scanner.nextInt();
        if(favoriteNumber>0){
            System.out.println("It is positive number.");
        }else if(favoriteNumber<0){
            System.out.println("It is negative number.");
        }else{
            System.out.println("It must be Zero.");
        }
    }
}
