package StringMethods;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // to be able to use string methods, you need to have a sting variable

        String device = "microphone";

        // contact() >> attach more value to given string

        device = device.concat ("is black colour");

        System.out.println(device);

        char letter2 = device.charAt(5);
        System.out.println(letter2);

        // lenth(); >>>  it will return numbers of characters from given ftring
        // java >> lenth () >> 4
        // what is the last index number for 'java' >>3

        int length = device.length();
        System.out.println(length);

        System.out.println(length*100);
        System.out.println(device.length() * 100);

        //hit ti get last char from the given string

        char c = device.charAt(24);
        System.out.println(c);

        //indexOf() >>  positioning, it will take char and will return index number for first matching char from given string

        device = "microphone";
        int indexOfH = device.indexOf('h');
        System.out.println(indexOfH);
        int i = device.indexOf("phone");
        System.out.println(i);

        device = "microphone";
        int n = device.indexOf ('o');

        int x = device.indexOf('o', n+1);




    }
}
