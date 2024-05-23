package FirstPractice;

public class AssignmentOperator {
    public static void main(String[] args) {

        int number = 8;

        number = number + 5;
        System.out.println(number);

        //+=
        number += 10;
        System.out.println(number);

        //-=
        number -= number;
        System.out.println(number);

        int count = 20;
        count -= number;
        System.out.println("count-> " + count);

        count += count + 10;
        System.out.println("count-> " + count);

        System.out.println("===========");

        //*=
        int number1 = 9 * 9;

        int number2 = 8;

        number2 *= number1;
        System.out.println("number2>> " + number2);

        // /=

        int divide = 100;

        divide /= 8;

        System.out.println("value of divide : " + divide);

        System.out.println("===========");

        // %=

        int burger = 12;

        int people = 5;

        burger %=people;
        System.out.println("how many burgers per person - " + burger);



    }
}
