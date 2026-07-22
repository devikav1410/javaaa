import java.util.Scanner;
public class program8 {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);        
System.out.print("Enter the student's marks (0-100): ");
double marks = sc.nextDouble();        
char grade;       
if (marks < 0 || marks > 100) {
System.out.println("Error: Invalid marks entered. Please enter a value between 0 and 100.");
sc.close();
return; 
}        
if (marks >= 90) {
grade = 'A';
} else if (marks >= 80) {
   grade = 'B';
} else if (marks >= 70) {
 grade = 'C';
} else if (marks >= 60) {
grade = 'D';
} else {
grade = 'F';
}           
System.out.println("The assigned grade is: " + grade);       
sc.close();
    }
}

