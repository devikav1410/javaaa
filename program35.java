import java.util.Scanner;
public class program35 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("enter no. of rows:");
int rows=sc.nextInt();
System.out.print("enter no. of columns:");
int columns=sc.nextInt();
int[][] matrix=new int[rows][columns];

System.out.println("enter elements");
for(int i=0;i<rows;i++){
for(int j=0;j<columns;j++){

matrix[i][j]=sc.nextInt();

}
}
System.out.println("the entered array is");
for(int i=0;i<rows;i++){
for(int j=0;j<columns;j++){
System.out.print(matrix[i][j]+"\t");

}
System.out.println();
}

System.out.println("sum of each column");
for(int j=0;j<columns;j++){
int colsum=0;
for(int i=0;i<rows;i++){

colsum += matrix[i][j];
}
System.out.println("sum of column"+(j+1)+":"+colsum);
}
sc.close();
}
}
