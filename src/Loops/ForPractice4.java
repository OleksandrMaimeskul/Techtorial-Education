package Loops;

public class ForPractice4 {
    public static void main(String[] args) {
        int item = 9;
        // infinite for loop
//        for(;;) {
//            System.out.println("INFINITE");
//        }
//        for(int a = 9; ;a++) {
//            System.out.println("INFINITE" + a);
//        }
        // multipple terms in for loop

        for(item = 100; item<200;item++){
            System.out.println("**********");

        }
        for (double d1 = 9, d2=25, d5 = 5; d1<d2 && d5>0; item++, d5++, d1++){
            d2--;
            System.out.println("Value of d1:" + d1);
            System.out.println("Value of d2:" + d2);
            System.out.println("Vslue of d5: " + d5);
            System.out.println(item);
            System.out.println("-------");
            int n = 5;
            for (boolean b = true; n < 10; n+=2){
                System.out.println("Different data usage in for > " + n );

            }
        }
    }
}
