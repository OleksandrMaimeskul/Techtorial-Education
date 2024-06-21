package ArraysPractice;

import java.util.Arrays;

public class MultiDimenssion2 {
    public static void main(String[] args) {
        /**
         *
         */
        String [][] cities = {{"New York","Pittsburh","Orlando"},
                {"Chicago","Springfield"},
                {"LA", "Seattle", "Mexico City", "Portland"}};

        System.out.println(Arrays.deepToString(cities));
        int i = 0;
        while (i<=cities.length-1){
            int j =0;
            while (j<=cities[i].length-1){
                System.out.println("Hi to >> " + cities[i][j]);
                j++;
            }
            i++;
        }
        for (int j = 0; j <= cities.length-1; j++) {
            for (int k = 0; k <=cities[j].length-1 ; k++) {
                System.out.println("Bye >>> " + cities[j][k]);

            }

        }
        for (String[] region : cities){
            for(String city : region){
                System.out.println("BYEEE" + city);
            }
        }
    }
}
