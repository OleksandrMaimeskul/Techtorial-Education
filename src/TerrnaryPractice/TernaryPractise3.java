package TerrnaryPractice;

public class TernaryPractise3 {
    public static void main(String[] args) {

        //nested ternary

        String str1 = "toyota", str2="volvo", str3="volkswagen";

        String result = str2.substring(3).equalsIgnoreCase(str3.substring(0, str3.indexOf('l'))) ?
                "Hello" : str1.toUpperCase().equals("TOYOTA") ? "SAM" : "JENNY";
        System.out.println(result);
        System.out.println(str3.substring(0, str3.indexOf('l')));
        System.out.println(str2.substring(3).equalsIgnoreCase(str3.substring(0, str3.indexOf('w'))) ?
                "Hello" : str1.toUpperCase().equals("TOYOTA") ? "SAM" : "JENNY");

        System.out.println("===========");
        int a =5, b=8;
        System.out.println(str3==str2 ? a++ : ++b); // increment or decrement will save the value by itself

        System.out.println("b>>>>" +b);

        System.out.println(b++ >= ++a +2 ? ++a : b++); //

    }
}
