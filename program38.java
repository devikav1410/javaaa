import java.util.Scanner;

public class MatrixMultiplication {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter rows & cols of matrix 1: ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        System.out.print("Enter rows & cols of matrix 2: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Multiplication not possible! c1 must equal r2.");
            return;
        }

        int[][] m1 = readMatrix(r1, c1, "first");
        int[][] m2 = readMatrix(r2, c2, "second");
        int[][] prod = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    prod[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        System.out.println("\nFirst Matrix:");
        printMatrix(m1);
        System.out.println("\nSecond Matrix:");
        printMatrix(m2);
        System.out.println("\nProduct Matrix:");
        printMatrix(prod);
    }

    public static int[][] readMatrix(int r, int c, String name) {
        int[][] mat = new int[r][c];
        System.out.println("Enter elements of " + name + " matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        return mat;
    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
