package IfStatement;

import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter letter: ");
//        char userEntry = scanner.next().toUpperCase().charAt(0);
         char userEntry = scanner.next().toUpperCase().charAt(0);
        if(userEntry == 'M'|| userEntry == 'm'){
            System.out.println("It is Monday");
        } else if (userEntry == 'T'|| userEntry == 't'){
            System.out.println("It is Tuesday");
        }else if (userEntry == 'W'|| userEntry == 'w'){
            System.out.println("It is Wednesday");
        }else if (userEntry == 'F'|| userEntry == 'f'){
            System.out.println("It is Friday");
        }else if (userEntry == 'S'|| userEntry == 's'){
            System.out.println("It is Saturday");
        } else if (userEntry != 'M'&& userEntry != 'T'&& userEntry != 'W'&& userEntry != 'F'&& userEntry != 'S'&&
                userEntry != 'm'&& userEntry != 't'&& userEntry != 'w'&& userEntry != 'f'&& userEntry != 's'){
            System.out.println("Wrong letter entered!");
        }
    }
}
