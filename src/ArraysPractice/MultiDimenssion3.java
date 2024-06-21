package ArraysPractice;

import java.util.Arrays;

public class MultiDimenssion3 {
        public static void main(String[] args) {
            /**
             * by using tradiotional for loop, if the city name is 'Seattle' > "this summer is ...Seattle .. time"
             */
            String[][] cities = {{"New York", "Pittsburh", "Orlando"},
                    {"Chicago", "Springfield"},
                    {"LA", "Seattle", "Mexico City", "Portland"}};
            for (int i = 0; i < cities.length; i++) {
                for (int j = 0; j < cities[i].length; j++) {
                    if (cities[i][j].equalsIgnoreCase("Seattle")){
                        System.out.println("this summer is " + cities[i][j] + " time");
                    } else {
                        System.out.println("WRONG ENTRY");
                    }

                }
            }
            }

        }

