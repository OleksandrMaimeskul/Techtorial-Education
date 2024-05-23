package TeamBuilding;

public class Currency {
    public static void main(String[] args) {
        int lira = 100;
        double exchangeRate = 32.28;
        double dollars = lira / exchangeRate;
        System.out.println("Exchanging of 100 liras to US dollars = " + dollars + " USD");
    }
}
