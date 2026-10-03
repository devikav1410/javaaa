import java.util.Scanner;
public class program7{
public static void main (String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter first no.");
double num1 =sc.nextDouble();
System.out.print("enter an operator.");
char operator =sc.next().charAt(0);
System.out.print("enter second no.");
double num2 =sc.nextDouble();
double result;
switch(operator) {
case '+':
result =num1 + num2;
System.out.println("result"+ num1 + "+" + num2 +"=" + result);
break;
case '-':
result =num1 - num2;
System.out.println("result"+ num1 + "-" + num2 +"=" + result);
break;
case '*':
result =num1 * num2;
System.out.println("result"+ num1 + "*" + num2 +"=" + result);
break;
case '/':
if (num2 ==0) {
System.out.println("error division by zero is not allowed");
} else {
result =num1 / num2;
System.out.println("result"+ num1 + "/" + num2 +"=" + result);
}
break;

default:
System.out.println("invalid operator");
break;
}
sc.close();
}
}
