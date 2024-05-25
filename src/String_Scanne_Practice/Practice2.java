package String_Scanne_Practice;

public class Practice2 {
    public static void main(String[] args) {
        String str = "text";

        String str2 = new String("text");

        System.out.println(str);
        System.out.println(str2);

        str = "something new";
        str2 = "\"abrakadabra\"";
        System.out.println(str);
        System.out.println(str2);
        System.out.println("something in quote");

        String str3 = "nice ";
        str3 = str3 + "is a adjective " + 100 + true;
        System.out.println(str3);

        // concatenation
        // concat() >> method / function

        str3.concat("isCorrect");
        System.out.println(str3);

        str3 = str3.concat("isCorrect");
        System.out.println(str3);
        System.out.println("----------------");

        String flower = new String ("Rose");
        flower = flower.concat(" is mostly red");
        System.out.println(flower.concat("bla bla bla"));

        // index >> position of char on the string value
        // index start from '0'

        String drink = "WATER";
        char c = drink.charAt(0);
        System.out.println(c);
        System.out.println(drink.charAt(0));







    }
}
