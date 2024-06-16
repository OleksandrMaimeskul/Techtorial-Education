package Loops;

public class FroEach2 {
    public static void main(String[] args) {
        //create a mixed char array
        // from your char array print out letter by using for-each loop
        char[] mixed = new char [] {'d','g','h','j','i','y','t','t','4','4','6','7','$','#','@'};
        for(char one : mixed){
            if (one >= 'A' && one <= 'Z' || one >= 'a' && one <= 'z') {
                System.out.print(one + ",");
            }
        }




    }
}
