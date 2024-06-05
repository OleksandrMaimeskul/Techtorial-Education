package SwitchPractice;

import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" What is favorite fruit: ");
        String chooseFruit = scanner.nextLine().toLowerCase();

        switch(chooseFruit){
            case "apple":
                System.out.println("We have your favorite fruit : " + chooseFruit);
                break;
            case "orange":
                System.out.println("We have your favorite fruit : " + chooseFruit);
                break;
            case "strawberry":
                System.out.println("We have your favorite fruit : " + chooseFruit);
                break;
            case "mango":
                System.out.println("We have your favorite fruit : " + chooseFruit);
                break;
            case "dragon fruit":
                System.out.println("We have your favorite fruit : " + chooseFruit);
                break;
            default:
                System.out.println("This fruit it doesnt present in store!");
        }
    }
}
