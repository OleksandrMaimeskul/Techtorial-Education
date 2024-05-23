package FirstPractice;

public class OperatorPrecedence {
    public static void main(String[] args) {

        int count = 5 - 6 * 2 / 3 + 10;
        System.out.println("Count>> " + count);

        count = 7 / 7 * 12 % 10 + 9 * 2 + 4 - 1;

        System.out.println("Count>> " + count);

        int count1 = count + count % 10 - 10 * 2 + 1;
        System.out.println("Count1>> " + count1);
    }
}
