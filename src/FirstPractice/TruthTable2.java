package FirstPractice;

public class TruthTable2 {
    public static void main(String[] args) {
        double requiredAverage = 70, requiredGPA = 2.5, requiredMoney = 5000;
        int test1 = 80, test2 = 70, test3 = 95;
        double GPA = 2.6, accountMoney = 5647.23;
        int average = (test1 + test2 + test3) / 3;
        boolean b = average > requiredAverage && GPA >= requiredGPA && accountMoney >= requiredMoney;
        System.out.println("Can you start MASTERS program or not? " + b);
    }
}
