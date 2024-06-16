package ArraysPractice;

public class Practice3 {
    public static void main(String[] args) {
        double [] numbers = new double[7];

        numbers[0] = 5.5;
        numbers[1] = 6.5;
        numbers[2] = 7.5;
        numbers[3] = 5.99;
        numbers[4] = 11.45;
        numbers[6] = 10.50;

        //from numbers array, find out total of given elements
double bucket = 0;
        for (int i = numbers.length-1; i >= 0; i--) {
            bucket+=numbers[i];

        }
        System.out.println("Total >>>>" + bucket);

    }
}
