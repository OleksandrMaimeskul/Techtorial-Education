package ArraysPractice;

import java.util.Arrays;

public class Practise4 {
    // another (2.) way of creating array
    public static void main(String[] args) {

        int[] name = new int[]{3, 5, 6, 9, 11, 30, 25, 8};

        System.out.println(Arrays.toString(name));
        System.out.println(name.length);
        System.out.println(name[5]);
        System.out.println(name[name.length - 1]);
        int i = name[name.length - 1];
        if (name[0] < i)
            System.out.println("first elemetn less than last");

        //3way of creating array
        int[] number3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(number3));

        number3[1] = 500;
        System.out.println(number3);
        System.out.println(Arrays.toString(number3));

        //find total of even numbers from number3 array
        int sum = 0;
        for (int j = 0; j < number3.length; j++) {
            if (number3[j] % 2 == 0) {
                sum += number3[j];
                System.out.println(sum);
            }

        }
    }
}