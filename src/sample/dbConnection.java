package sample;

import java.sql.*;
import java.util.Objects;

public class dbConnection {
    public static Connection connect() {
        Connection conn;
        String connPath = "jdbc:sqlite:src/sample/DB/usersDB.db";

        try {
            conn = DriverManager.getConnection(connPath);
            System.out.println("Connection established");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }

    public static void dbQuery(String query) {
        Statement stmt;
        Connection connec = connect();
        System.out.println(connec);
        try {
            stmt = connec.createStatement();
            stmt.executeUpdate(query);
            stmt.close(); connec.close(); System.out.println("Query connection closed");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean checkEmailExists(String email) {
        Statement stmt;
        Connection connec = connect();
        try {
            stmt = connec.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("SELECT EXISTS(SELECT Email FROM Users WHERE Email = '%s');", email));
            boolean result = rs.getBoolean(1);

            stmt.close(); connec.close(); System.out.println("Email Check connection closed");

            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean checkLogin(String email, String pass) {
        Statement stmt;
        Connection connec = connect();

        try {
            stmt = connec.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("SELECT Password FROM Users WHERE Email = '%s';", email));
            return Objects.equals(pass, rs.getString(1));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean checkIsAdmin(String email) {
        Statement stmt;
        Connection connec = connect();

        try {
            stmt = connec.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("SELECT isAdmin FROM Users WHERE Email = '%s'", email));
            return rs.getBoolean(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
