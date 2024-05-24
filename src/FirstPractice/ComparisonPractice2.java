package FirstPractice;

public class ComparisonPractice2 {
    public static void main(String[] args) {

        /**
         * there is an event for kids
         * if the age of kid is less than 12 or equal to 12
         * that kid can attend this event
         * represent this situation with variables and comparison
         * >> Can attend the event? t/f
         */
        int kidAge = 3;
        int requiredAge = 12;
        boolean canAttend = kidAge <= requiredAge;
        System.out.println("Can attend the event? " + (kidAge <= 12));
        System.out.println("Can attend the event? " + canAttend);

        canAttend = requiredAge >= kidAge;
        System.out.println(canAttend);

        System.out.println("=======================");

        /**
         * there is a raffle that will pick all letters from alphabet but letter 'T'
         * resent the case and
         * >> Did pick? ..T/F
         */
        char notWantedLetter = 'T', yourLetter = 'A';
        boolean b = yourLetter != notWantedLetter;
        System.out.println(b);

        /*
        delivery fee for your order, if your location is 5 miles or more away from yhe store
        >> pay fee
        "You are paying delivery fee or not?"
         */
        int myLocation = 2, exactLocation = 5;
        boolean isItFar = myLocation <=exactLocation;
        System.out.println("You are paying delivery fee or not? " + isItFar);


    }
}
