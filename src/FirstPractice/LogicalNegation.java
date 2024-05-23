package FirstPractice;

public class LogicalNegation {
    public static void main(String[] args) {
// ! >>LogicalNegation symbol is !
// we use '!' on boolean variables or any boolean condition
        // '!' makes the boolean value to it's opposite true<<>>false

        boolean bool = true;
        boolean b = !bool;
        System.out.println(b);
        System.out.println(!bool);
        bool = !true;
        System.out.println(bool);
        boolean isChair = !bool;
        System.out.println(isChair);

        boolean isWednesday = true;
        System.out.println(isWednesday);
        System.out.println(!isWednesday);

        isWednesday = !isWednesday;
        System.out.println(isWednesday);

        boolean isCorrect = !isWednesday;
        System.out.println(!isCorrect);
    }
}
