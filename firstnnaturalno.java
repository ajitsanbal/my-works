import java.util.Scanner;

public class firstnnaturalno {
    public static void main(String[] args){
        System.out.println("enter value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        for (int i=1;i<=n;i++){
            a=a+i;

        }
        System.out.println(a);
//int i=1;
//        while (i<=n){
//            a=a+i;
//
//            i++;
//        }System.out.println(a);
    }
}
