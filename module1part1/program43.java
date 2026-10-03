class calculator{
int add(int a, int b) {
return a+b;
}
int add(int a,int b,int c) {
return a+b+c;
}
double add(double a,double b) {
return a+b;
}
}
public class program43{
public static void main(String[] args){
calculator calc =new calculator();
System.out.println("add two integers 10+20=" + calc.add(10,20));
System.out.println("add three integers 10+20+30=" + calc.add(10,20,30));
System.out.println("add two double values 10.11+20.34=" +calc.add(10.11,20.34));
}
}
