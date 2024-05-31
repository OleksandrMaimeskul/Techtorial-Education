package IfStatement;

public class NestedIf {
    public static void main(String[] args) {
        /**
         * visit
         * if state is IL
         * >> city
         * if city is >>Des Plaines >> We are here
         * otherwize >> "Wrong Location"
         * if state is not IL:
         * >> You are in DIFFERENT STATE
         */
        String state = "IL", city = "Chicago";
        if(state.equalsIgnoreCase("IL")){
            System.out.println("Correct");
            if (city.equalsIgnoreCase("Des Plaines")){
                System.out.println("We are here");
            } else {
                System.out.println("Wrong Location");
            }
        }
    }
}
