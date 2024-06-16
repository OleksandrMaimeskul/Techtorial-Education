package SplitPractice;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        String word = "Interview";

        String[] parts = word.split("e");
        System.out.println(Arrays.toString(parts));
        System.out.println(Arrays.toString(word.split("r")));
        ;


        System.out.println("==================");

        String sentence = "I want to do my best on the quiz";
        String[] split = sentence.split(" ");
        System.out.println(Arrays.toString(split));
        System.out.println("===================");
        /*
        from give string find the word'saturday' and compare it with the name of the day today
        // if they are matching. >> " i have a technical class of this day"


         */
        String day = "saturday";
        String sentence2 = " one of the weekend day is saturday";
        String[] bucket = sentence2.split(" ");
        for (String n : bucket) {
            if (n.equalsIgnoreCase(day)) {
                System.out.println(" i have a technical class of this day");
            }

        }
        System.out.println("===================");
    }
}
