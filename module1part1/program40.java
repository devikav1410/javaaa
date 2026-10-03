import java.util.Scanner;

public class program40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        if (rows != cols) {
            System.out.println("\nThe matrix is NOT symmetric (It must be a square matrix).");
            scanner.close();
            return;
        }

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        boolean isSymmetric = true;
        for (int i = 0; i < rows; i++) {
        
            for (int j = i + 1; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break; 
                }
            }
            if (!isSymmetric) {
                break;
            }
        }

        if (isSymmetric) {
            System.out.println("\n The given matrix IS a symmetric matrix.");
        } else {
            System.out.println("\n The given matrix IS NOT a symmetric matrix.");
        }

        scanner.close();
    }
}

