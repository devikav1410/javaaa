package college;

public class Student {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void display() {
        System.out.println("Student Name: " + name + ", Roll No: " + rollNo);
    }
}
