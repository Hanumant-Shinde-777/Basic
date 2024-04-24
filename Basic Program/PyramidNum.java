/**
 Java Program to Print Pyramid Number Pattern
 */
public class PyramidNum {

    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pyramid
        int startNum = 1; // Starting number for the pattern

        // Outer loop to iterate through each row
        for (int i = 1; i <= rows; i++) {
            
            // Inner loop to print leading spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Print two spaces for alignment
            }
            
            // Inner loop to print numbers in ascending and descending order
            int currentNum = startNum + i - 1;
            boolean ascending = true;
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(currentNum + " ");
                
                if (ascending) {
                    currentNum++;
                } else {
                    currentNum--;
                }
                
                if (k == i) {
                    ascending = false;
                }
            }
            
            // Move to the next line after printing each row
            System.out.println();
        }
    }
    }
