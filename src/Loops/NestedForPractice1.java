package Loops;

public class NestedForPractice1 {
    public static void main(String[] args) {

        for (int x = 0; x<5; x++){
            System.out.println("I am in the first loop");

            for ( int y = 0; y<4; y++){
                System.out.println("Thing are getting easy!!");
            }
            System.out.println("Finished INNER LOOP");
        }
        System.out.println("Finished outer loop");

    }
}
