package StringMethods;

public class Task2 {
    public static void main(String[] args) {
        /*
            "wild cats cannot play as domestics!"
    from above string:
        -print count of characters in the last word 'domestic'
        -make part of string upper case > 'play as domestic'
        -print only word 'play'
         */
        String str = "wild cats cannot play as domestics!";
        System.out.println(str.substring(str.lastIndexOf(' ')+1).length()-1);
        System.out.println(str.substring(str.indexOf('p')).toUpperCase());
        System.out.println(str.substring(str.indexOf('p'), str.indexOf('y')+1));
    }
}
