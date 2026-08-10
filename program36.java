import java.util.Scanner;
public class program36 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("enter no. of rows:");
int rows=sc.nextInt();
System.out.print("enter no. of columns:");
int columns=sc.nextInt();
int[][] matrix=new int[rows][columns];
int[][] transpose=new int[columns][rows];
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
for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
System.out.println("transpose");
for(int i=0;i<columns;i++){
for(int j=0;j<rows;j++){
 System.out.print(transpose[i][j]+"");
}
System.out.println();
}
sc.close();
}
}
