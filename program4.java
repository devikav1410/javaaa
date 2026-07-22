import java.util.Scanner; 
public class program4 { 
public static void main (String[] args) { 
Scanner sc = new Scanner(System.in);  
System.out.print("enter first no:"); 
 double num1 = sc.nextDouble(); 
System.out.print("enter second no:"); 
double num2 = sc.nextDouble();    
 System.out.print("enter third no:"); 
double num3 = sc.nextDouble();    
if (num1 >= num2) { 
if (num1 >= num3) {
System.out.println(num1 + " is largest"); 
} else {
 System.out.println(num3 + " is largest"); 
 }
} else { 
if (num2 >= num3) {

 System.out.println(num2 +"is largest"); 
 
} else {
 System.out.println(num3 +"is largest");  
 }
 }     
sc.close(); 
} 
}

