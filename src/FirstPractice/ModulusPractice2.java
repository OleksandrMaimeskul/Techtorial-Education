package FirstPractice;

public class ModulusPractice2 {
    public static void main(String[] args) {

        int number = 234;
        int digit1 = (number / 100) % 10;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        int multiplication = digit1 * digit2 * digit3;
        System.out.println("Multiplication of all digits in number is: " + multiplication);
    }
}
