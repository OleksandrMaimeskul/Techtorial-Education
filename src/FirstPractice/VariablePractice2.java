package FirstPractice;

public class VariablePractice2 {
    public static void main(String[] args) {
        // 5 red, 3 yellow, 7 green
        // represent data with variables, find total numbers of apples,
        // show / print total number of apples

        int redApples = 5;
        int yellowApples = 3;
        int greenApples = 7;

        System.out.println(yellowApples);

//        in the following lines, finding total numbers of apples
        System.out.println(redApples + yellowApples + greenApples);
        int totalAplles = redApples + yellowApples + greenApples;
        System.out.println("Total number of apples are:>> " + totalAplles);
/*
find out total payment amount if:
each red 2$, yellow $3, green $5
-find out totaL payments
=print total payment with additional tax amount of $2.5
>>Total payment for apples is: $....<<
 */
        int red$ = 2;
        int yellow$ = 3;
        int green = 5;
        double tax = 2.5;
        int totalPayment = redApples * red$ + yellowApples * yellow$ + greenApples * green;

        System.out.println("Total payment for apple is " + (totalPayment + tax));
    }
}
