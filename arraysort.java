import java.util.Scanner;
import java.util.Arrays;

public class arraysort{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();       
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }       
        Arrays.sort(numbers);          
        System.out.println("Array in ascending order: " + Arrays.toString(numbers));        
        scanner.close();
    }
}
