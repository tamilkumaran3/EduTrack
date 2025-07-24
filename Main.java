import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        StudentDAO dao = new StudentDAO();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add\n2. View All\n3. Update\n4. Delete\n5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    sc.nextLine(); // consume newline
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Percentage: ");
                    float perc = sc.nextFloat();
                    dao.addStudent(new Student(name, dept, perc));
                    break;

                case 2:
                    dao.viewAll();
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int id = sc.nextInt();
                    System.out.print("New Percentage: ");
                    float newPerc = sc.nextFloat();
                    dao.updateStudent(id, newPerc);
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    dao.deleteStudent(delId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
