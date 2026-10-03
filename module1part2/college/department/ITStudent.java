package college.department;

public class ITStudent {
    String name;
    int rollNo;

    public ITStudent(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void display() {
        System.out.println("IT Student Name: " + name + ", Roll No: " + rollNo);
    }
}
