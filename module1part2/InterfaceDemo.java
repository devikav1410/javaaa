interface Printable {
    void print();
}

class Student implements Printable {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public void print() {
        System.out.println("Student Name: " + name + ", Roll No: " + rollNo);
    }
}

class Teacher implements Printable {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void print() {
        System.out.println("Teacher Name: " + name + ", Subject: " + subject);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Printable p;

        p = new Student("Ali", 101);
        p.print();

        p = new Teacher("mr. john", "Maths");
        p.print();
    }
}
