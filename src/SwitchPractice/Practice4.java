package SwitchPractice;

public class Practice4 {
    public static void main(String[] args) {
        String color = "red";
        String message = " ";
        switch (color) {
            case "red":
                message = "Red is on the flag";
                break;
            case "blue":
                message = "Ocean is Blue";
                break;
            case " black":
                message = "Favorite color";
                break;
            default:
                message = "COLOR IS COLOR";
        }
        System.out.println(message);
    }
}
