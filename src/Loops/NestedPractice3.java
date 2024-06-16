package Loops;

public class NestedPractice3 {
    public static void main(String[] args) {
        /*
        create a digital clock that will show hours and minutes
        hours >> 6 to 12
        minutes >> 0 to 59
        6:0
        7:0
         */

        for (int hour = 6; hour < 12; hour++) {
            for (int minute = 0; minute <= 59; minute++) {

                if (minute < 10) {
                    System.out.println(hour + ":" + "0" + minute);
                } else {
                    System.out.println(hour + ":" + minute);
                }
                for (int seconds = 0; seconds < 60; seconds++) {
                    System.out.println(hour + ":" + minute + ":" + seconds);

                }
            }
            System.out.println("---------");
        }
//        int hour = 6;
//        while (hour<=12){
//            int minure = 0;
//            while (minure<60){
//                System.out.println(">>>> " + hour + ":" + minure);
//                minure++;
//            }
//            hour++;

//        }
    }
}
