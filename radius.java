
import java.util.*;
public class radius {
    public static void main(String[] args) {

    double pi=3.14;
        System.out.println("enter radius of the circle R:");
        Scanner sc=new Scanner(System.in);
        float R= sc.nextFloat();

        double area=pi*R*R;
        System.out.println(area);
    }}