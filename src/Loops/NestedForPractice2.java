package Loops;

public class NestedForPractice2 {
    public static void main(String[] args) {
        /*
        Create a multiplication table for number 1 to 10 up to 12s
        1*1 = 1
        1*2=2
        ...
        1*12 = 12
        .....
         */
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=12 ; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
            System.out.println("----------");

        }
    }
}
