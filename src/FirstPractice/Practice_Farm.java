package FirstPractice;

public class Practice_Farm {
    public static void main(String[] args) {

        /**
         * Calculate number of legs in the farm if:
         * there are 15 cows and 35 chickens
         * >> represent data with variables
         * >> print total numbers of legs in this year
         */

        int cows = 15, chickens = 35;
        int cowsLegs = 4, chickenLegs = 2;
        int cowsLegsTotal = cows * cowsLegs, chickensLegsTotal = chickens * chickenLegs;
        int totalLegs = cowsLegsTotal + chickensLegsTotal;
        System.out.println("There are " + totalLegs + " legs in the farm.");

        /**
         * find out total worth of this farm if:
         * each cow costs: 1350.99
         * each  chicken costs: 34.50
         *
         * > print total worth of this farm
         */


        double cowsCost = 1350.99, chickenCost = 34.50;
        double totalWorth = cows * cowsCost + chickens * chickenCost;
        System.out.println("Total worth of the farm is: " + totalWorth + "$");


    }
}
