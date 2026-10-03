import java.util.Scanner;
public class program21{
public static void main(String[] args){
Scanner sc = new Scanner (System.in);
System.out.println("enter no.of elements in the array:");
int size = sc.nextInt();
int[] numbers = new int[size];
System.out.println("enter "+ size +"integers:");
for(int i=0;i<size;i++) {
numbers[i] = sc.nextInt();
}
sc.close();
if(size > 0) {
int smallest = numbers[0];
for(int i=1;i<size;i++) {
if(numbers[i] < smallest) {
smallest = numbers[i];
}
}
System.out.println("the smallest element is :"+ smallest);
} else {
System.out.println("the array is empty");
}
}
}

