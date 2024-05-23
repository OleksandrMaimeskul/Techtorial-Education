package FirstPractice;

public class UnaryOperators {
    public static void main(String[] args) {

        int studentNumber = 25;
        System.out.println(studentNumber);

        // pre-increment
        ++studentNumber;
        System.out.println(++studentNumber);
        studentNumber = ++studentNumber + 10;
        System.out.println(studentNumber);
        System.out.println("=============");

        //Pre-Decrement
        --studentNumber;
        System.out.println(studentNumber);
        System.out.println("=============");

        System.out.println("____________Post-increment / decrement ___________");

        int mouse = 90;
        mouse++;
        System.out.println(mouse);

        System.out.println(++mouse); // PRE, first increase/decrease value and use it
        System.out.println(mouse++); // POST, use the value first than increase / decrease
        System.out.println(mouse);
        System.out.println(mouse--);

        int itemCount = mouse + 10;
        System.out.println(itemCount);


        itemCount = 10;
        System.out.println(itemCount++ + itemCount + 10);

        System.out.println("============");

        int a = 8, b = ++a, c = a + b++ + 5;
        int result = ++a + --b;
        System.out.println(result-- * 2);




    }
}
