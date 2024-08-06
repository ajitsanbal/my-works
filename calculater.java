import java.util.Scanner;

public class calculater {
    public static void main(String[] args){

        Scanner c=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a=c.nextInt();
        int b=c.nextInt();
        System.out.println("Enter 1 for addition\n" +
                "Enter 2 for Subtraction\n" +
                "Enter 3 for multiplication\n" +
                "Enter 4 for divison\n" +
                "Enter 5 for modulus\n");
        System.out.println("enter u r opptiion");
        int opp= c.nextInt();
        switch (opp){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            case 5:
                System.out.println(a%b);
                break;
        }
    }
}
