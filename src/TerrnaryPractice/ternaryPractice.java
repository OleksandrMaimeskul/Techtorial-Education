package TerrnaryPractice;

public class ternaryPractice {
    public static void main(String[] args) {
        /*
        if your name is Jake, will print >> "your name is Jake"
        otherwise >> "you are not Jake"
         */
        String name = "Jake";
        if(name.equalsIgnoreCase("Jake")){
            System.out.println("Your name is Jake");
        } else {
            System.out.println("your name isnot Jake");
        }
        System.out.println("------------------------");
        /// implementing above if condition with TERNARY

        String result = name.equalsIgnoreCase("JAKE") ? "your name is Jake" : "You are not Jake";
        System.out.println(result);
        System.out.println("------------------------");

        double myMoney = 10, $car = 20;

        String result2 = myMoney >= $car ? "You can Buy that car " : "Need more money";
        System.out.println("I am buying a car" + result2);
        System.out.println("------------------------");
        double result3 = myMoney >= $car ? myMoney + 1000 : myMoney - 1000;
        System.out.println(result3);

//        myMoney>= $car ? "Have enough money" : (myMoney - 1000)    - you cant store result of this ternary since
        // options are returning to different data type
        System.out.println(myMoney>= $car ? "Have enough money" : (myMoney - 1000)); // But you can print this
    }

}
