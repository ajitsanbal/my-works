import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        // Change this to the desired number
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d%n", num, i, num * i);
        }
    }
}
