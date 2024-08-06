public class starpyrmid {
    public static void main(String[] args){

        int n=4;
    for (int i=1; i<=n; i++){
        for (int j=1;j<=n-i;j++){
            System.out.print(" ");
        }

        for (int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }
        System.out.println();}

        //lower half
        for (int j = 1; j <= n - 4; j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= 2 * 4 - 1; j++) {
            System.out.print("*");
        }
        System.out.println();

        for (int j = 1; j <= n - 3; j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= 2 * 3 - 1; j++) {
            System.out.print("*");
        }
        System.out.println();

        for (int j = 1; j <= n - 2; j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= 2 * 2 - 1; j++) {
            System.out.print("*");
        }
        System.out.println();

        for (int j = 1; j <= n - 1; j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= 2 * 1 - 1; j++) {
            System.out.print("*");
        }
        System.out.println();

    }}


