import java.util.*;

public class simpleinterest {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter principle amount P:");
        float P=sc.nextFloat();
        System.out.println("Enter rate of interest per annum R in % :");
        float R=sc.nextFloat();
        System.out.println("Enter time T:");
        float T= sc.nextFloat();
        float I=(P*R*T)/100;
        System.out.println("simple intrest is I="+I);
        float Total=I+P;
        System.out.println("total Amount="+Total);}
}
