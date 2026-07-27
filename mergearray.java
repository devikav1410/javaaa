import java.util.Scanner;
import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // 1. Get details for the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] firstArray = new int[size1];
        
        System.out.println("Enter " + size1 + " elements for the first array:");
        for (int i = 0; i < size1; i++) {
            firstArray[i] = scanner.nextInt();
        }

        // 2. Get details for the second array
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] secondArray = new int[size2];
        
        System.out.println("Enter " + size2 + " elements for the second array:");
        for (int i = 0; i < size2; i++) {
            secondArray[i] = scanner.nextInt();
        }

        // 3. Initialize the third array to hold both sets of elements
        int[] mergedArray = new int[size1 + size2];

        // 4. Merge the first array into the new array
        for (int i = 0; i < size1; i++) {
            mergedArray[i] = firstArray[i];
        }

        // 5. Merge the second array right after the first one
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = secondArray[i];
        }

        // 6. Display the final merged results
        System.out.println("\n--- Results ---");
        System.out.println("First Array: " + Arrays.toString(firstArray));
        System.out.println("Second Array: " + Arrays.toString(secondArray));
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
