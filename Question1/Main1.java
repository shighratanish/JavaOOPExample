class Student {
    int id;
    String name;
    String course;

    // Constructor Overloading
    Student() {
        System.out.println("Default Constructor Called");
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Course: " + course);
    }
}

// Subclass demonstrating Method Overriding
class GraduateStudent extends Student {
    String specialization;

    GraduateStudent(int id, String name, String course, String specialization) {
        super(id, name, course);
        this.specialization = specialization;
    }

    // Method Overriding
    @Override
    void display() {
        System.out.println("Graduate Student -> ID: " + id + ", Name: " + name + ", Course: " + course + ", Specialization: " + specialization);
    }
}

public class Main1 {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent(101, "Tanish", "AI", "Machine Learning");
        gs.display();
    }
}

