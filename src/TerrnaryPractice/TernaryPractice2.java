package TerrnaryPractice;

import java.util.Scanner;

public class TernaryPractice2 {
    public static void main(String[] args) {
        /*
        let user enter time of the day as in following format
        11-am or 11-pm
        If the time includes "am" >> Good Morning
                              "pm" >> Good Afternoon
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter time in the following format: 11-am / 11-pm");
        String time = scanner.nextLine();
        String am = time.contains("-am") ? "Good Morning" : "Good Afternoon";
        String pm = time.contains("-pm") ? "Good Morning" : "Good Afternoon";
        System.out.println("What is your time: " + am);
        System.out.println("What is your time: " + pm);

        System.out.println("==================");

        String g2 = time.substring(time.indexOf('-')+1, time.indexOf('-')+3).equalsIgnoreCase("am")?
                "Good Morning": "Good afternoon";
        System.out.println(g2);

    }
}
