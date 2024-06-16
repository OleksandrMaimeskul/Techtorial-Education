package ArraysPractice;

import java.util.Arrays;

public class Practice9 {
    public static void main(String[] args) {
        /**
         * Trying to store different data type on the array
         */
        String name = "Alex";
        int age = 12;
        char letter = 'e';
        boolean isStudent = false;

        Object [] mixedArray = {name, age,letter,isStudent};
        System.out.println(Arrays.toString(mixedArray));

        //print each element one by one from above array

        for (int i = 0; i < mixedArray.length; i++) {
            System.out.println(mixedArray[i] + "*");
            if(mixedArray[i].equals(12)){
                System.out.println(">>>> " + mixedArray[i].toString().charAt(0));

            }

        }
    }
}
