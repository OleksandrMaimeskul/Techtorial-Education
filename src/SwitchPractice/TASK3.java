package SwitchPractice;

import java.util.Scanner;

public class TASK3 {
    /**
     * Making call to ChaseBank: TASK-SWITCH-TASK
     * <p>
     * call center auto reply give following options:
     * <p>
     * 1 - Admin
     * 2 - HR
     * 3 - IT
     * 4 - Customer Care
     * <p>
     * Each department has different numbers of employee working
     * <p>
     * Admin: >> is Jake only.
     * HR: >>> John, David, Maria
     * IT: >>> Sarah, Amit
     * Customer >> Ana, Aiza
     * <p>
     * when user selects a department, user should see employee names as options to speak with
     * and user should select employee to connect
     * >> print >> You are speaking with ..AMIT.. from ..IT.. department.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Call center auto reply give following options: \n 1 - Admin \n 2 - HR " +
                " \n 3 - IT \n 4 - Customer Care ");
        int number = scanner.nextInt();
        scanner.nextLine();

        switch (number) {
            case 1:
                System.out.println("You can speak with Admin Jake");
                break;
            case 2:
                System.out.println("You can speak with John, David, Maria from HR Department");
                String chooseName = scanner.nextLine();
                switch (chooseName) {
                    case "John":
                        System.out.println("You speaking with John from HR Department"+ chooseName);
                        break;
                    case "David":
                        System.out.println("You speaking with David from HR Department"+ chooseName);
                        break;
                    case "Maria":
                        System.out.println("You speaking with Maria from HR Department"+ chooseName);
                        break;
                    default:
                        System.out.println("No persons with indicated names!");
                        break;
                }
                break;
            case 3:
                System.out.println("You can speak with Sarah, Amit from IT Department");
               String chooseName1 = scanner.nextLine();
                switch (chooseName1) {
                    case "Sarah":
                        System.out.println("You speaking with Sarah from IT Department"+ chooseName1);
                        break;
                    case "Amit":
                        System.out.println("You speaking with Amit from IT Department" + chooseName1);
                        break;
                    default:
                        System.out.println("No persons with indicated names!");
                        break;
                }
                break;
            case 4:
                System.out.println("You can speak with Ana, Aliza from Customer's Department");
               String chooseName2 = scanner.nextLine();
                switch (chooseName2) {
                    case "Ana":
                        System.out.println("You speaking with Ana from Customer's Department" + chooseName2);
                        break;
                    case "Aliza":
                        System.out.println("You speaking with Aliza from Customer's Department" + chooseName2);
                        break;
                    default:
                        System.out.println("No persons with indicated names!");
                        break;
                }
                break;
            default:
                System.out.println("Wrong number! ");
                break;
        }
//        if (number == 1) {
//            System.out.println("You can speak with >>> with Admin Jake");
//        } else if (number == 2) {
//            System.out.println("You can speak with >>> John, David, Maria from HR Department");
//        } else if (number == 3) {
//            System.out.println(" You can speak with >>> Sarah, Amit from IT Department");
//        } else if (number == 4) {
//            System.out.println("You can speak with >>> Ana, Aiza from customer's service");
//        }
    }
}
