package Loops;

public class DoWhilePractice1 {
    public static void main(String[] args) {
        int a =6, b = 8;
//
//        do{
//            System.out.println("Hello");
//        } while (a<b);
//
//        int a1 =6, b1 = 10;

        do{
            System.out.println("Night");
            b--;
        } while (a<b);

        a=6; b=10;
        do{
            System.out.println("evening");
            a++;
            System.out.println(" a " + a);
        } while (a<=b);

    }
}
