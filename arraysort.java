import java.util.Scanner;
import java.util.Arrays;

public class SortAscendingBuiltIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Get array size from user
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        
        // 2. Initialize array and accept inputs
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // 3. Sort array using Java utility method
        Arrays.sort(numbers);
        
        // 4. Print the sorted elements
        System.out.println("Array in ascending order: " + Arrays.toString(numbers));
        
        scanner.close();
    }
}
