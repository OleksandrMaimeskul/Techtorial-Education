package String_Scanne_Practice;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner dataTacker = new Scanner(System.in);
        System.out.println("Please enter your weight in kg: ");
        double weight = dataTacker.nextDouble();
        System.out.println("Please enter your height in mtrs: ");

        double height = dataTacker.nextDouble();
        double BMI = weight / (height*height);
        System.out.println("Your BMI is: " + BMI);

        boolean goodShape = BMI >= 18 && BMI <= 24;
        System.out.println("Am i in good shape? " + goodShape);

    }
}
