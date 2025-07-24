public class Student {
    int id;
    String name;
    String department;
    float percentage;

    public Student(String name, String department, float percentage) {
        this.name = name;
        this.department = department;
        this.percentage = percentage;
    }

    public Student(int id, String name, String department, float percentage) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.percentage = percentage;
    }
}

