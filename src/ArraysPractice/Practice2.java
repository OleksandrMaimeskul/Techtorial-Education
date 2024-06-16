package ArraysPractice;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        String[] coockies = new String[100];
        System.out.println(Arrays.toString(coockies));
        coockies[coockies.length - 1] = "OREO";
        coockies[6] = "M&M";
        coockies[3] = "MARS";
        System.out.println(Arrays.toString(coockies));

        System.out.println(coockies[6]);
        // want to print each coockie one by one;
        //this is my favorite >> ...M&M...
        for (int i = 0; i < coockies.length; i++) {
            System.out.println(coockies[i]);

        }
        int i = 0;
        while (i > 1) {
            System.out.println(coockies[i]);
            i++;
        }
        //found your favorite

        String myFavorite = "ORANGE";
        for (int index = 0; index < coockies.length; index++) {

            if (coockies[index] != null && coockies[index].equalsIgnoreCase(myFavorite)) {
                System.out.println("This is my favorite >> " + index);
            }

        }

    }
}
