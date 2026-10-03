import java.util.Scanner;

public class LinearSearchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Take array size and elements from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // 2. Take the target element to search for
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();
        
        // 3. Perform Linear Search
        int foundIndex = -1; // -1 means the element is not found yet
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundIndex = i; // Save the index where it was found
                break;          // Stop searching since we found it
            }
        }
        
        // 4. Print the result
        System.out.println("\n--- Search Result ---");
        if (foundIndex != -1) {
            System.out.println("Element " + target + " found at index position: " + foundIndex);
        } else {
            System.out.println("Element " + target + " is not present in the array.");
        }
        
        scanner.close();
    }
}
