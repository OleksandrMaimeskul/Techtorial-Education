package Loops;

import org.w3c.dom.ls.LSOutput;

public class ContinueStatement {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (i >= 5 && i <=7) {
                continue;
            }
            System.out.println(++count + " - Blaa Bla Bla - " + i);

        }
        System.out.println("==================");
        for (char ch = 'A'; ch <='Z'; ch++){

            if (ch>= 'H' && ch <= 'T') continue;
            System.out.println(ch);
        }
        System.out.println("=============");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
            if (j>3){
                continue;
            }
                System.out.println("It is getting so eaasy!");

            }
            System.out.println("this is Larger Loop print END");


        }
        System.out.println("=============");

        for (int num = 1; num < 10; num++) {
            if (num==7) continue;
            for (int num2 = 0; num2 <= 10; num2++) {
                if(num2 >= 4 && num2 <=5) continue;
                System.out.println(num + "*" + num2 + "=" + num*num2);

            }
            System.out.println("---------");

        }
    }

}
