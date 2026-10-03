import java.util.Scanner;

public class MultipleExceptionsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter array index: ");
        int index = sc.nextInt();

        try {
            int value = arr[index];  
            int result = value / 2;  
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic exception occurred.");
        } finally {
            System.out.println("Exception handling completed.");
        }

        sc.close();
    }
}
