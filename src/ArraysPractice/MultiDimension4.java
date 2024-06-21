package ArraysPractice;

public class MultiDimension4 {
    public static void main(String[] args) {

        /**
         * sections >> fruits,dairy, chips
         * "apple yogurt lays
         * orange  milk cheetos
         * grapes butter pringles
         * mango        doritos
         * fruitos
         *
         * 1.46   3.99  2.58
         * 2.99  5.99   2.98
         * 0.99   4.50  3.49
         * 1.5          3.49
         *              2.50
         *
         *              "Apple price is $..1.46..
         */
        String[][] items = {{"apple", "orange", "grapes", "mango"}, {"yougurt", "milk", "butter"}, {"lays", "cheetos", "pringles", "doritos", "fritos"}};
        double[][] prices = {{1.46, 2.99, 0.99, 1.50}, {3.99, 5.99, 4.50}, {2.50, 2.98, 3.49, 3.49, 2.50}};

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.println(items[i][j] + " price is $" + prices[i][j]);

            }

        }

    }
}