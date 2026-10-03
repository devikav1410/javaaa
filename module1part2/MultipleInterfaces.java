interface Sports {
    void showSportsInfo();
}

interface Academics {
    void showAcademicInfo();
}

class Student implements Sports, Academics {
    String name;
    int rollNo;
    String sport;
    String grade;

    Student(String name, int rollNo, String sport, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.sport = sport;
        this.grade = grade;
    }

    @Override
    public void showSportsInfo() {
        System.out.println("Student " + name + " participates in: " + sport);
    }

    @Override
    public void showAcademicInfo() {
        System.out.println("Student " + name + " has grade: " + grade);
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        Student s = new Student("Rahul", 102, "Football", "A");

        s.showAcademicInfo();
        s.showSportsInfo();
    }
}
