package ArraysPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        //storing multiple integer values as a representation of someone's age

        int[] ages = new int[7];
        System.out.println(Arrays.toString(ages));
        ages[0] = 21;
        System.out.println(Arrays.toString(ages));
        ages[1] = 25;
        ages[5] = 30;
        ages[3] = 19;
        System.out.println(Arrays.toString(ages));


        ages[2] = 19;
        ages[4] = 34;
        System.out.println(Arrays.toString(ages));

        //re-assignment also possible
        ages[2] = 22;
        System.out.println(Arrays.toString(ages));

//        ages[10] = 100;
//        System.out.println(Arrays.toString(ages));   <<<< Error
        System.out.println(ages[5]);
        System.out.println(ages.length);
        ages[ages.length - 1] = 200;
        System.out.println(Arrays.toString(ages));

        System.out.println("==========");


    }
}
