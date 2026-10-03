import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        // Create a 2D array of size 3x3
        int[][] matrix = new int[3][3];
        
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Take 3x3 matrix input from the user
        System.out.println("Enter 9 elements for the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Print the 3x3 matrix
        System.out.println("\nThe 3x3 Matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(); // Moves to the next line after printing a row
        }
        
        // Close the scanner object
        sc.close();
    }
}

