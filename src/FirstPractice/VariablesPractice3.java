package FirstPractice;

public class VariablesPractice3 {
    public static void main(String[] args) {
        //declaring variables > defining data type and name for a variable

        int myAge;

        //initializing variable > giving a value to variable

        myAge = 31;

        System.out.println(myAge);
        System.out.println(myAge + 10);
        System.out.println("My age is getting older " + myAge);

        // Re-assignment
        myAge = 45;
        System.out.println(myAge);

        int studentNumber = 50;

        //Common rules / practices for variable naming
        // -you can use _ and $ in naming
        int money_ = 9;
        int money$ = 9;
        // -You can use numbers
        int money1 = 9;
        // -You can start with numbers

        // -You cannot use java keywords
        //  int void =7;

        // You cannot use same variable name multiple times in the same scope
        // -if you are using multiple words in the naming,
           //-start with lower case for the first word abd other words should start with uppercase (camelCase)
               //-start with Upper case for the first word abd other words should start with uppercase (PascalCase)
    }
}
