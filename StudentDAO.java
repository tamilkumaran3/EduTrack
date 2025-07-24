import java.sql.*;
import java.util.*;

public class StudentDAO {
    Connection conn = DBConnection.getConnection();

    public void addStudent(Student s) throws SQLException {
        String sql = "INSERT INTO students (name, department, percentage) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, s.name);
        ps.setString(2, s.department);
        ps.setFloat(3, s.percentage);
        ps.executeUpdate();
        System.out.println("Student added successfully!");
    }

    public void viewAll() throws SQLException {
        String sql = "SELECT * FROM students";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " | " + rs.getString("name") + " | " +
                            rs.getString("department") + " | " + rs.getFloat("percentage")
            );
        }
    }

    public void updateStudent(int id, float newPercentage) throws SQLException {
        String sql = "UPDATE students SET percentage = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setFloat(1, newPercentage);
        ps.setInt(2, id);
        int rows = ps.executeUpdate();
        if (rows > 0) System.out.println("Updated successfully.");
        else System.out.println("Student not found.");
    }

    public void deleteStudent(int id) throws SQLException {
        String sql = "DELETE FROM students WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        int rows = ps.executeUpdate();
        if (rows > 0) System.out.println("Deleted successfully.");
        else System.out.println("Student not found.");
    }
}
