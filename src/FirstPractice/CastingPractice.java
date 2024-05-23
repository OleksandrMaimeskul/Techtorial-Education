package FirstPractice;

public class CastingPractice {
    public static void main(String[] args) {

        //-implicit casting

        byte b1 = 5;
        int i1=b1;

        System.out.println(b1);

        short sh = 8;
        float fl = sh;
        System.out.println(fl);

        //-explicit casting

        double d1 = 2.4;
        short sh1 = (short)d1;
        System.out.println(sh1);

        byte b2 = (byte)-130;

        System.out.println(b2);

        /**
         * you buy 2 items from a store
         * first one is $234, SECOND ITEM is $450
         * represent item prices as short data type
         * and cast the total amount into byte data type >> print it
         */

        short item1 = 234;
        short item2 = 450;
        byte total = (byte) (item1 + item2);
        System.out.println(total);

        byte b4=4, b5=7;
        int r = b4 + b5;
        byte r1 = (byte) (b4+b5);

        byte b7 = 74;
        char ch7 = (char) b7;

        System.out.println(ch7);


    }
}
