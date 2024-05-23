package FirstPractice;

public class ModulusPractice {
    public static void main(String[] args) {
        int number = 31;
        int number1 = number % 10;
        int number2 = (number / 100)%10;
        int number3 = (number /10)%10;
        int sum =number1 + number2 + number3;
        System.out.println(sum);


    }
}
