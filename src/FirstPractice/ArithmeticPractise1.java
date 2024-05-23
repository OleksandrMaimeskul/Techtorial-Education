package FirstPractice;

public class ArithmeticPractise1 {
    public static void main(String[] args) {
        //+ >> Addition

        int number = 5 + 6;
        int number2 = number + 10;
        int result = number + number2;
        System.out.println(number); //11
        System.out.println(result); //32

        //- >> Subtraction

        float result2 = number - 3;
        result2 = result - number;
        System.out.println(result2);

        // * >> Multiplication

        int money = 100;

        int itemCount = 12;

        double costOfItems = money * itemCount;
        System.out.println("Cost of items all together " + costOfItems);

        // - / - division

        int carNumbers = 10;
        int numberOfPeople = 3;

        int result4 = carNumbers / numberOfPeople;
        System.out.println(result4);

        System.out.println(carNumbers / numberOfPeople);

        System.out.println("=============");

        System.out.println(5.0 / 2);

        System.out.println("=============");

        // Modulus operator >> which will return remainder from diviion problem

        int ten = 10, twenty = 40;

        int result6 = twenty % ten;

        System.out.println(result6);

        int result3 = twenty % 6;
        System.out.println("Result3 " + result3);

        System.out.println("=============");

        System.out.println(12%10);
        System.out.println(24%10);
        System.out.println(231%10);
        System.out.println(45019%10);

        System.out.println("=============");

        System.out.println(123%100);
        System.out.println(123/100);


    }
}
