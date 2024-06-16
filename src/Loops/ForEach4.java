package Loops;

import java.util.Arrays;

public class ForEach4 {
    public static void main(String[] args) {
        String word = "Instagram";
        // >> store each leter of word in a char array
char [] bucket = new char [word.length()];
        for (int i = 0; i < word.length() ; i++) {
            bucket[i]= word.charAt(i);
            System.out.print(bucket[i] + ",");

        }
        System.out.println("==========");
        System.out.println(Arrays.toString(bucket));
    }
}
