import java.util.Scanner;

public class atm {public static void main(String[] args) {

    //atm
    int opp;
    int cardno = 123456789;
    int pin = 3575;
    System.out.println("well come");
    System.out.println("insert your card");
    System.out.println("press button 1 for see balence\n" +
            "press button 2 for withdraw amount\n" +
            "press button 3 to change pin\n");
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();
    switch (button) {
//to see balence
        case 1:
            System.out.println("enter 4 digit pin");
            opp = sc.nextInt();

            if (pin == opp) {
                System.out.println(" balence is\n" + 10000);
            } else {
                System.out.println("invalid pin");
            }
            break;
        //to withdraw mony
        case 2:
            System.out.println("enter 4 digit pin");
            opp = sc.nextInt();
            if (opp == pin) {
                System.out.println("'enter amount'");
                int mony = sc.nextInt();
                System.out.println("collect your amount\n\n " + mony
                        + "\n\nThankyou");
            } else {
                System.out.println("invalid pin");
            }
            break;
        case 3:
            System.out.println("enter 4 digit pin");
            opp = sc.nextInt();
            if (pin == opp) {
                System.out.println("enter new 4 digit pin ");
                int newpin = sc.nextInt();
                pin = newpin;
                System.out.println("re enter new pin");
                int renewpin = sc.nextInt();

                    if (renewpin == newpin)
                        System.out.println("pin changed successfully");
                     else System.out.println("pin not matched\n" +
                            "transaction Denied\n");
                    break;


                }
        default:
            System.out.println("invalid opption");

            }
    }
}