class Area{
double area(double s) {
return s*s;
}
double area(double a,double b) {
return a*b;
}
double area(float r) {
return Math.PI * r*r;
}
}
public class program44{
public static void main(String[] args){
Area calc =new Area();
System.out.println("area of square with side 5=" + calc.area(5.0));
System.out.println("area of rectangle with l=10 b=20 :" + calc.area(10,20));
System.out.println("area of circle with radius r=2.50 =" +calc.area(2.5f));
}
}
