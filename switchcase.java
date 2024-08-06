import java.util.Scanner;

public class switchcase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR OPPTION");
       int button = sc.nextInt();
        switch (button){
            case 1: System.out.println("hello");
            break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("vanakkam");

            default:
                System.out.println(" entry is invalid");}
    }
}
