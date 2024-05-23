package FirstPractice;

public class ModulusPractice3 {
    public static void main(String[] args) {
        /**
         * bought a smartphone for $1265
         * -you will be paying 100$ for each month
         * -> print out: numbers of instalment that you will have
         * -> amount of payment for las instalment
         */

        int smartphonePrice = 1265;
        int monthlyPayment = 100;
        int numbersOfInstalment = smartphonePrice/monthlyPayment +1 ;
        int lastInstalment = smartphonePrice%100;
        System.out.println("Number of Instalments " + numbersOfInstalment);
        System.out.println("Last instalment " + lastInstalment);
    }
}
