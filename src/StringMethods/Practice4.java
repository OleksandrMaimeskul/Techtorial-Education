package StringMethods;

public class Practice4 {
    public static void main(String[] args) {
        // replace() >> it will replace given char / string with new char / string

        String color = "orange";
        String replace = color.replace('r', 'R');
        System.out.println(replace);
        color = color.replace('r', 'R');
        System.out.println(color);
        color = color.replace('o', '$');
        System.out.println(color);

        color = color.replace("e", "**");
        System.out.println(color);
        color = color.replace("###", "----");
        System.out.println(color + "<<<<<");

        //replace entire string with 5 '@' symbol $Rang** >>> @@@@@

        String str1 = color.replace("$Rang**", "@@@@@");
        System.out.println(str1);
        String str2 = color.replace(color, "@@@@@");
        System.out.println(str2);

        String fruit = "strawberry";
        fruit = fruit.replace('r', '-');
        System.out.println(fruit);
        fruit = "chicago is one of the best city in the world";
        fruit = fruit.replace("the", "**");
        System.out.println(fruit);

        //Trim() >> it will remove leading and ending spaces from string


        String str = " weather is very nice today ";
        System.out.println(str);
        str = str.trim();
        System.out.println(str);

        // Method Chaining
        // using  a method after one another is called method changing.

        char str7 = str.replace('e', 'E').substring(str.indexOf('v')).toUpperCase().charAt(3);
        System.out.println(str7);
        System.out.println(str.replace('e', 'E').substring(str.indexOf('v')));

        //from the last version of Str take last word and print length of it

        System.out.println(str.substring(str.indexOf("today")) .length());

        System.out.println(str.substring(str.lastIndexOf(' ')+1).length());
    }
}
