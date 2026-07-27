  import java.util.Scanner;
public class duplicate{
 public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);        
 System.out.print("Enter the number of elements: ");
int n = scanner.nextInt();       
 int[] array = new int[n];
System.out.println("Enter " + n + " elements:");
for (int i = 0; i < n; i++) {
array[i] = scanner.nextInt();
}        
 System.out.print("Duplicate elements: ");
for (int i = 0; i < array.length; i++) {
for (int j = i + 1; j < array.length; j++) {
 if (array[i] == array[j]) {
 System.out.print(array[j] + " ");
 break; 
}
 }
}        
scanner.close();
 }
}
