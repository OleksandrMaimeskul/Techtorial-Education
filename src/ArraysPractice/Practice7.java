package ArraysPractice;

import java.util.Arrays;

public class Practice7 {
    public static void main(String[] args) {
        String name = "Surprise";
        /*
        pick each letter from above string, modify each letter to uppercase
        and add ** before and after AND store them into a new String array
        S>>**S** >> >> ["**S**", "**U**,.....
         */
        name = name.toUpperCase();
        String [] modified = new String [name.length()];
        for (int i = 0; i < name.length(); i++) {
           modified[i] = "**" + name.charAt(i) + "**";
            System.out.println(Arrays.toString(modified));
        }
        System.out.println(Arrays.toString(modified));
    }
}
