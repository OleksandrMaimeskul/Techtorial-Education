package ArraysPractice;

import java.util.Arrays;

public class Practice8 {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "yellow", "White", "Orange", "BLACK"};
        System.out.println(Arrays.toString(colors));

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));
        System.out.println(  Arrays.binarySearch(colors,"red"));

        //print every string from above array in reverse version
        // >> "der".....
        String[] modigiedVersion = new String[colors.length];
        String [] bucket = new String [colors.length];
        for (int i = 0; i < colors.length; i++) {
            String color = colors[i];
            String reversed = "";

            for (int j = color.length()-1; j >= 0  ; j--) {
                reversed+=color.charAt(j);

            } System.out.println(reversed);
            bucket[i] = reversed;


        }
        System.out.println(Arrays.toString(bucket));

    }
}
