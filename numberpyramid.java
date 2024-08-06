public class numberpyramid {
        public static void main(String[] args) {
            int n = 5; // You can change this value to print more or fewer rows
            for (int i = 1; i <= n; i++) { // Outer loop for number of rows
                for (int j = 1; j <= i; j++) { // Inner loop for number of columns
                    System.out.print(i); // Print the current row number
                }
                System.out.println(); // Move to the next line after each row
            }
        }
    }


