package FirstPractice;

public class TruthTable {
    public static void main(String[] args) {

        //&&
        /*
        event for adults
        age is 21 and over
        valid ID >> if the number is more than 100 it is valid ID number

        "You OK to come in?" T/F
         */
        int myAge = 61, requiredAge = 21;
        int validIDNumber = 100, yourIDNumber = 101;
        boolean b = myAge >= requiredAge;
        boolean b1 = yourIDNumber >= validIDNumber;
        boolean b2 = b && b1;
        System.out.println("You OK to come in? " + b2);

        boolean b3 = yourIDNumber > requiredAge && myAge >= requiredAge;
        System.out.println(b3);

        System.out.println("=====================");

        /*
        roller coaster to ride
        if your child is 8 years old or more
        your childs height is 48 inches or more
        it is okay to ride roller coaster
         */
        int requiredAge1 = 8, myChildAge = 10;
        int requiredHeight=43, myChildHeight = 44;
        boolean b4 = myChildAge >= requiredAge1 && myChildHeight >= requiredHeight;
        System.out.println(" it is okay to ride roller coaster? " + b4);

        // ||


    }
}
