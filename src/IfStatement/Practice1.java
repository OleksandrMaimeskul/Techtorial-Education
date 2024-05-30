package IfStatement;

import java.sql.SQLOutput;

public class Practice1 {
    public static void main(String[] args) {
        int myMoney = 100, yourMoney = 200;

        //if your money more than mine, print >> "You are richer than you"


        System.out.println("++++++++++");
        boolean result = yourMoney < myMoney;
        if (result) {
            System.out.println("You are richer than you ");
        }
        System.out.println("hello");
        System.out.println("hello".substring(2));
        System.out.println("*****");
        int a = 9;
        System.out.println(a * 100);

        // if today is Wednesday print is
        String day = "wendesday";
        boolean result2 = day.equals("wendesday");
        if (result2) {
            System.out.println("there is class to attend");
        }
        System.out.println("+++++++++++++++++++");
        if (day.equals(("Tuesday"))) {
            System.out.println("there is class to attend------<<<<----");
        }
        // there is an event for kids to attend
        // if kid's age is btwn 12 and 18
        // Print >> "Your child can attend the event"

        int kidAge = 13, minAge = 12, maxAge = 18;
        double admissionFee = 10.0, yourMoney2 = 1.25;
//        kidAge > minAge && kidAge < maxAge;
//        admissionFee<=yourMoney2;
        if((kidAge > minAge && kidAge < maxAge)&&(admissionFee<=yourMoney2) ){
            System.out.println("Your child can attend the event");
        }
    }
}
