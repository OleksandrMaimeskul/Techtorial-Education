package Loops;

public class ForPractice5 {
    public static void main(String[] args) {
        /*
        using for loop, create multiplication table for number 7s
         */
int number = 7;
        for (int i = 1; i > 0 && i <=10 ; i++) {
            int i1 = i * number;
            System.out.println(i1);
        }
        System.out.println("==============");
        // make a table for muNumber which should have only multiples of 5s up to 100
        // 7*5 >>35
        // .....
        // 7*100
        for (int i = 5; i <=100 ; i+=5) {
            int i1 = i * number;
            System.out.println(i1);
        }
    }
}
