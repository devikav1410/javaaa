class employee{
String name;
int id;
double salary;

void display(){
System.out.println("name :"+name);
System.out.println("id :"+id);
System.out.println("salary :"+salary);
}
}
public class program42{
public static void main(String[] args){
employee e1 = new employee();
e1.name="sam";
e1.id=1;
e1.salary=22200;
System.out.println("obj1 created");
e1.display();
employee e2 = new employee();
e2.name="zayn";
e2.id=2;
e2.salary=25200;
System.out.println("obj2 created");
e2.display();
employee e3 = new employee();
e3.name="riya";
e3.id=3;
e3.salary=22700;
System.out.println("obj3 created");
e3.display();
}
}
