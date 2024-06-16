package Loops;

import java.util.Random;

public class RandomPractice {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(2);
        System.out.println(num == 0 ? "HEAD" : "TAIL");
    }
}
