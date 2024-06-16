package Loops;

public class forPractice1 {
    public static void main(String[] args) {
// bellow for loop is infinite loop

//        for (; ; ) {
//            System.out.println("i like running");
//        }

//        for ( ; 3<=5;  ){
//            System.out.println("i like running");
//        }
        int num = 3, num2 = 5;
        for ( ; num < num2; ) {
            System.out.println("i like running");
            num++;
        }
        System.out.println("========");

        for (int count1 = 9;count1 < 15; count1++) {
            System.out.println("i like running 2222222");
        }
        System.out.println("============");
        //creat a lop for print number from 20 to 30
        for (int i = 20; i <= 30; i++) {
            System.out.println(i);
        }
        System.out.println("==============");
        // can you create or initialize different data type in for loop parenthesis - no

        // create a for loop to print numbers from 50 to 0

        for (int i = 50; i >= 0 ; i--) {
            System.out.println("Counting down: " + i);

        }{

        }
    }
}
