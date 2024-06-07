package Loops;

public class doWhilePractice5 {
    public static void main(String[] args) {
        String test = "Wishing for ";
        // we want to print out only letter 'i's
/**
 * 1-print out first letter from string
 * 2-print out second letter from string
 * 3 - print out last letter
 * 4 - print out first letter for 5 times
 * 5- print out all letters
 * 6-print our certain letter
 * 7-print count of certain letter
 *
 */

        int num = 1;
        do {
            System.out.println(test.charAt(0));
            num++;
        } while (num < 6);
//5 -print out all letters
        int index = 0;
        do {
            System.out.println(test.charAt(index));
            index++;
        } while (index < test.length());
        //6
        int i = 0;
        do {
            if (test.charAt(i) == 'i') {
                System.out.println("============");
                System.out.println(test.charAt(i));
            }
            i++;
        } while (i < test.length());

//        7-print count of certain letter
        int i2 =0, countingLetterI = 0;
        do {
            if (test.charAt(i2) == 'i') {
                System.out.println("============");
                System.out.println(countingLetterI);
                countingLetterI++;

            }
            i2++;
        } while (i < test.length());
    }
}