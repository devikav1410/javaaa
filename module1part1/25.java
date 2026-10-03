import java.util.Scanner;

public class ReverseWithoutPackage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Take array input from the user
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        
        int[] original = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            original[i] = scanner.nextInt();
        }
        
        // 2. Manually print the original array
        System.out.print("\nOriginal Array: [");
        for (int i = 0; i < size; i++) {
            System.out.print(original[i]);
            if (i < size - 1) {
                System.out.print(", "); // Add a comma between elements
            }
        }
        System.out.println("]");
        
        // 3. Create a new array and reverse using 'i = last element'
        int[] reversed = new int[size];
        int targetIndex = 0;
        
        for (int i = original.length - 1; i >= 0; i--) {
            reversed[targetIndex] = original[i];
            targetIndex++;
        }
        
        // 4. Manually print the reversed array
        System.out.print("Reversed Array: [");
        for (int i = 0; i < size; i++) {
            System.out.print(reversed[i]);
            if (i < size - 1) {
                System.out.print(", "); // Add a comma between elements
            }
        }
        System.out.println("]");
        
        scanner.close();
    }
}
