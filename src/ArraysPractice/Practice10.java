package ArraysPractice;

import java.util.Arrays;

public class Practice10 {
    public static void main(String[] args) {
        // from a string array, pick each element first letter and make a new word
        // print out your new string
        // {"adidas", "nike","puma","lululemon","zara,"...} >>anplz >>

        String [] array = new String[]{"adidas", "nike","puma","lululemon","zara"};
String bucket = "", bucket2 = "";
        for (int i = 0; i < array.length; i++) {
//            String [] array2 = new String[]{String.valueOf(array[i].charAt(0))};
//            System.out.print(Arrays.toString(array2));
            bucket = bucket+ array[i].charAt(0);
            bucket2 = bucket2 + array[i].charAt(array[i].length()-1);

        }
        System.out.println(bucket);
        System.out.println(bucket2);





    }
}
