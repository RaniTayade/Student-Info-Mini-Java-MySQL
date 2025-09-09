import java.sql.*;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // DB name = testdb
        String user = "root";   // your MySQL username
        String password = "root"; // your MySQL password (change if different)

        Scanner sc = new Scanner(System.in);

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to Database!");

            // 3. Insert Data
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student Age: ");
            int age = sc.nextInt();

            String insertQuery = "INSERT INTO students (name, age) VALUES (?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertQuery);
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.executeUpdate();
            System.out.println("✅ Student Added Successfully!");

            // 4. Fetch & Display Data
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            System.out.println("\n--- Student Records ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id")
                        + ", Name: " + rs.getString("name")
                        + ", Age: " + rs.getInt("age"));
            }

            // 5. Close
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
