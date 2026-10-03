import java.util.Scanner;

public class program39{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix (N x N): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int principalSum = 0;
        int secondarySum = 0;
        System.out.print("\nPrincipal Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
            principalSum += matrix[i][i];
        }
        System.out.print("\nSecondary Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - 1 - i] + " ");
            secondarySum += matrix[i][n - 1 - i];
        }

        System.out.println("\n\nSum of Principal Diagonal: " + principalSum);
        System.out.println("Sum of Secondary Diagonal: " + secondarySum);

        scanner.close();
    }
}

