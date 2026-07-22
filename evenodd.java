import java.util.Scanner;
public class evenodd{
public static void main (String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter a no. to check odd or even");
int num=sc.nextInt();
if(num%2==0){
System.out.println(num +"is even");
} else {
System.out.println(num +"is odd");
}
sc.close();
}
}
