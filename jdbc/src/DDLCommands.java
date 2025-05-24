import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DDLCommands {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/yourDatabase";
        String user = "yourUsername";
        String password = "yourPassword";

        String createTableSQL = "CREATE TABLE IF NOT EXISTS employees (" +
                                "id INT PRIMARY KEY AUTO_INCREMENT, " +
                                "name VARCHAR(100), " +
                                "email VARCHAR(100), " +
                                "salary DOUBLE)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            int result = stmt.executeUpdate(createTableSQL);
            System.out.println("CREATE TABLE executed, returned: " + result);
            System.out.println("Table created successfully (if it didn't exist).");

        } catch (SQLException e) {
            System.out.println("DDL Error: " + e.getMessage());
        }
    }
}
