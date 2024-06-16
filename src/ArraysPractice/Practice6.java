package ArraysPractice;

import java.util.Arrays;

public class Practice6 {
    public static void main(String[] args) {
        char[] symbols = {'4', 't', 'A', '&', '6', 'R', '!', '~'};
        /*
        from above given array, print out symbols only
         */

        for (int i = 0; i < symbols.length; i++) {
            if (!(symbols[i] >= 'A' && symbols[i] <= 'Z') && !(symbols[i] >= 'a' && symbols[i] <= 'z')
                    && !(symbols[i] >= '0' && symbols[i] <= '9')) {
                System.out.println(">>" + symbols[i]);
            }
        }
        /*
        take digits from above array and store them into a new array
        at the end, print out your new array to check if the digits are stored properly
         */
char [] bucket = new char [symbols.length];
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] >= '0' && symbols[i] <= '9') {
                bucket[i]= symbols[i];
                System.out.println(Arrays.toString(bucket));
            }

        }
    }
}
