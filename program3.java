
import java.util.Scanner; 
public class program3 { 
public static void main (String[] args) { 
Scanner sc = new Scanner(System.in);  
System.out.print("enter first no:"); 
 double num1 = sc.nextDouble(); 
System.out.print("enter second no:"); 
double num2 = sc.nextDouble();       
if (num1 > num2) { 
System.out.println(num1 + " is largest"); 
} else if (num2 > num1) {
 System.out.println(num2 + " is largest"); 
} else { 
 System.out.println("both nos are equal"); 
}       
sc.close(); 
} 
}

