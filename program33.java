import java.util.Scanner;
public class program33 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("enter no. of rows:");
int rows=sc.nextInt();
System.out.print("enter no. of columns:");
int columns=sc.nextInt();
int[][] matrix=new int[rows][columns];
int sum=0;
System.out.println("enter elements");
for(int i=0;i<rows;i++){
for(int j=0;j<columns;j++){

matrix[i][j]=sc.nextInt();
sum+=matrix[i][j];
}
}
System.out.println("the entered array is");
for(int i=0;i<rows;i++){
for(int j=0;j<columns;j++){
System.out.print(matrix[i][j]+"\t");

}
System.out.println();
}
int l=matrix[0][0];
int s=matrix[0][0];
for(int i=0;i<rows;i++){
for(int j=0;j<columns;j++){
if(matrix[i][j]>l){
l=matrix[i][j];
}
if(matrix[i][j]<s){
s=matrix[i][j];
}
}
}
System.out.println("largest "+l);
System.out.println("smallestest "+s);
sc.close();
}
}
