package Loops;

public class Practice6 {
    /**
     * Print letter from a string one by one which separated by '-'
     * String str = "chocolate" >> c-h-o-c-o-l-a-t-e
     */
    public static void main(String[] args) {

        String str = "saturday";
        int i = 0;
           do {

               if (str.length()-1 == i) {
                   System.out.print(str.charAt(i));
               } else {
                   System.out.print(str.charAt(i) + "-");
               }
               i++;
        } while (i<str.length());

    }
}
