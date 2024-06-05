package SwitchPractice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" What is favorite fruit: ");
        String chooseFruit = scanner.nextLine().toLowerCase();

        switch(chooseFruit){
            case "apple":
            case "orange":
            case "strawberry":
            case "mango":
            case "dragon fruit":
                System.out.println("We have your favorite fruit : " + chooseFruit);
                break;
            default:
                System.out.println("This fruit it doesnt present in store!");
        }
        System.out.println("===================");
        switch (scanner.nextInt()){
            case 3:
                System.out.println("*****");
                break;
            case 5:
                System.out.println("testing");
                break;
            default:
                System.out.println("TESTING");
        }
    }
}
