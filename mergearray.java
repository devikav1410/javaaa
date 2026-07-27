import java.util.Scanner;
import java.util.Arrays;
public class mergearray{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("enter size of firstt array:");
int size1=sc.nextInt();
int[] firstarray=new int [size1];
System.out.println("enter"+ size1 + "elements for first");
for(int i=0;i<size1;i++){

firstarray[i]=sc.nextInt();
}
System.out.print("enter size of second array:");
int size2=sc.nextInt();
int[] secondarray=new int [size2];
System.out.println("enter"+ size2 + "elements for second");
for(int i=0;i<size2;i++){

secondarray[i]=sc.nextInt();
}
int[] mergedarray=new int [size1+size2];
for(int i=0;i<size1;i++){
mergedarray[i]=firstarray[i];
}
for(int i=0;i<size2;i++){
mergedarray[size1+i]=secondarray[i];
}
System.out.println("results");
System.out.println("first array:"+ Arrays.toString(firstarray));
System.out.println("second array:"+ Arrays.toString(secondarray));
System.out.println("merged array:"+ Arrays.toString(mergedarray));
sc.close();
}
}
