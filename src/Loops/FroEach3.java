package Loops;

import java.util.Arrays;

public class FroEach3 {
    public static void main(String[] args) {
        /**
         * Pick up First Letters and store in Char Array
         */
        String[] countires = {"USA", "CANADA", "MEXICO", "JAMEICA" };
        char[] first = new char[countires.length];
        int i = 0;
        for (String country : countires) {
            first[i] = country.charAt(0);
            i++;
        }
        System.out.println(Arrays.toString(first));

    }
}
