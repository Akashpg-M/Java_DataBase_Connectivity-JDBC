import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DMLCommand {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/yourDatabase";
        String user = "yourUsername";
        String password = "yourPassword";

        String insertSQL = "INSERT INTO employees (name, email, salary) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

            pstmt.setString(1, "John Doe");
            pstmt.setString(2, "john@example.com");
            pstmt.setDouble(3, 60000);

            int rowsInserted = pstmt.executeUpdate();
            System.out.println("Rows inserted: " + rowsInserted);

        } catch (SQLException e) {
            System.out.println("DML Error: " + e.getMessage());
        }
    }
}
