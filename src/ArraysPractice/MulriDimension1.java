package ArraysPractice;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class MulriDimension1 {
    public static void main(String[] args) {

    int [] [] numbers = new int[4][3];
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers[0]));
        System.out.println(Arrays.deepToString(numbers));
        numbers[0][0] = 38;
        numbers[0][2] = 50;
        System.out.println(Arrays.deepToString(numbers));

        System.out.println(numbers.length);
        System.out.println(numbers[0].length);

        numbers[3][2] = 100;
        numbers[numbers.length-1][numbers[numbers.length-1].length-1] = 500;
        System.out.println(Arrays.deepToString(numbers));

        System.out.println("=================");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                System.out.println(numbers[i][j]);

            }

        }
        System.out.println("=================");
        for (int[] name:numbers) {
            for (int single : name) {
                System.out.println(single);

            }
        }

}
}
