package Loops;

public class BreakInLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            System.out.println(i);
            break;
        }
        for (int i = 0; i < 21; i++) {

            if (i == 15) {
                break;
            }
            System.out.println(">>>" + i);
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.println(i + "*" + j + "=" + i * j);

            }
            break;
        }
    }
}
