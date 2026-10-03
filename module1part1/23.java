import java.util.Scanner;

public class CountEvenOddScanner {
    public static void main(String[] args) {
        // Corrected Scanner initialization using System.in
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        int evenCount = 0;
        int oddCount = 0;
        
        System.out.println("Enter " + size + " integer elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            
            // Check if the input number is even or odd
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        // Close the scanner resource
        scanner.close();
        
        System.out.println("\n--- Results ---");
        System.out.println("Total Even Elements: " + evenCount);
        System.out.println("Total Odd Elements: " + oddCount);
    }
}
