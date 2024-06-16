package Loops;

public class ForEach1 {
    public static void main(String[] args) {
        int[] zipCode = {100, 101, 204, 303, 509, 112, 200};
        //print out each zipcode by using for each

        for (int zip : zipCode) {
            System.out.println(zip);
        }
        // print out zipcodes if that is multiples of 5
        System.out.println("=================");
        for (int zip : zipCode) {
            if (zip % 5 == 0) {
                System.out.println(zip);
            }
        }
        System.out.println("=================");
        for (int i = 0; i < zipCode.length; i++) {
            if (zipCode[i] % 5 == 0) {
                System.out.println(zipCode[i]);
            }


        }
        System.out.println("=================");
        String[] drinks = {"water", "tea", "coffee", "lemonade", "kombucha", "spring water" };
//        / if the number of letter on a drink is 6 and more print that drink
        for (String drink : drinks) {
            if (drink.length() >= 6) {
                System.out.println(drink);
            }
        }
        System.out.println("=================");

        for (int i = 0; i < drinks.length; i++) {
            if (drinks[i].length() >= 6) {
                System.out.println(drinks[i]);
            }
        }

    }
}
