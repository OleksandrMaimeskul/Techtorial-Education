package TeamBuilding;

public class Task5 {
    public static void main(String[] args) {
        int wheels5 = 5;
        int wheels4 = 4;

        int chairSteelCase = 6;
        int chairSavent = 5;

        int totalChairSteelCaseWheels = chairSteelCase * wheels5;
        int totalChairSaventWheels = chairSavent * wheels4;
        int totalWheels = totalChairSaventWheels + totalChairSteelCaseWheels;

        System.out.println("Total quantity of wheels required for Steel Case " + totalChairSteelCaseWheels);
        System.out.println("Total quantity of wheels required for Savent " + totalChairSaventWheels);
        System.out.println("Total quantity of wheels required for two kinds of chairs " + totalWheels);
    }
}
