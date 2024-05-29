package StringMethods;

public class Practice2 {
    public static void main(String[] args) {
        String quote = "Just Do It";

        //toUpperCase

        quote = quote.toUpperCase();
        System.out.println(quote);

        quote = quote.toLowerCase();
        System.out.println(quote);

        //startsWith() >> it will check if given string starts with given 'char/char sequence
        //it returns true / false
        boolean result = quote.startsWith("just");
        System.out.println(result);
        boolean result2 = quote.startsWith("j");
        System.out.println(result2);
        boolean result3 = quote.startsWith("just do it");
        System.out.println(result3);

        //endsWith()
        boolean result4 = quote.endsWith("it");
        System.out.println(result4);
        System.out.println(quote.endsWith("just do it!"));

        System.out.println("------------Contains--------------");

        //contains

        boolean result5 = quote.contains(" ");
        System.out.println(result5);
        boolean result6 = quote.contains("do");
        System.out.println(result6);
        boolean result7 = quote.contains(quote.toUpperCase());
        boolean result8 = quote.contains(quote.toLowerCase());
        System.out.println(result7);
        System.out.println(result8);

        String str = "Tea is good when it is hot";
        boolean result9 = str.contains(quote.concat(str));
        System.out.println(result9);

        quote += str;
        System.out.println("----weird----" + (quote.concat(str)));

        System.out.println("----------Equal Method---------");

        String veggie = "cucumber";
        String fruit = "strawberry";

        System.out.println(veggie.equals(fruit));

        veggie = "strawberry";
        System.out.println(fruit.equals(veggie));

        System.out.println(veggie.concat(fruit).equals(fruit)); // False
        System.out.println(veggie.concat(fruit).contains(fruit)); // True

        System.out.println("veggie " + veggie);
        System.out.println("fruit " + fruit);

        System.out.println(veggie == fruit);

        String str1 = "Sam";

        String str2 = new String("Sam");
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));

        System.out.println("--------------------------");

        System.out.println(str1 == str2);
        System.out.println(str2 == str1);

        String str3 = new String("Sam");
        System.out.println(str2.equals(str3));
        System.out.println(str2 == str3);

        /*
        when you use .equals() method with string, it will compare string values
        when you use == with or any other object comparison, it will compare
        location of objects in memory
         */
        String name1 = "sam";
        String name2 = "sam";
        System.out.println(name1 == name2);
    }
}
