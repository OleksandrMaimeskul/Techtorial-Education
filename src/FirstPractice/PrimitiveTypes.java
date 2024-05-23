package FirstPractice;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // byte
        byte number1 = 5;
        System.out.println(number1 + 10);

        byte number2 = 127; // Upper Limit
        byte number3 = -128; // Lower  Limit

        //short
        short number4 = 7;
        System.out.println(number4);
        System.out.println(number4 + number2);
        System.out.println("_______________");

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println("_______________");

        short number5 = 32767;
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println("_______________");

        int number6=12;
        System.out.println(number6+number6+number6);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        int i1 = 2_34_56;
        System.out.println("_______________");

        long l=100;
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        // for numeric values can use Underscore '_' between digits;
        long l2 = 1_000_000_000;
        System.out.println("_______________");

        System.out.println("---------Decimal Type-------");

        //float

        float number7 = 45.5f;
        System.out.println(number7);
        System.out.println("_______________");
        //double
        double number8 = 12.12d;
        System.out.println(number8);
        double number9 = 5;
        System.out.println(number9);
        System.out.println("_______________");
        int i = 5;
        System.out.println(i);
        System.out.println("_______________");

        double count = number1 + number6 + number7;
        System.out.println(count);



    }
}
