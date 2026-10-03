import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Multiplication Table of " + num + ":");

       
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        scanner.close();
    }
}

