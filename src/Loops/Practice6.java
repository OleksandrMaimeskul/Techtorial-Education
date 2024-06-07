package Loops;

public class Practice6 {
    /**
     * Print letter from a string one by one which separated by '-'
     * String str = "chocolate" >> c-h-o-c-o-l-a-t-e
     */
    public static void main(String[] args) {

        String str = "chocolate";
        int i = 0;
           do {
               str = "-"+ str.charAt(i);
               i++;
               if (str.lastIndexOf('-')){
                   System.out.print(str);
               }
        } while (i<str.length());

    }
}
