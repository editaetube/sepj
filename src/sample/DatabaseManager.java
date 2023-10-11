package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            // SQLite database URL
            String url = "C:\\Users\\mucho\\Desktop\\FH_5S\\SEPJ_GS\\sepj_db_dokumente\\mydb.db";

            // Establish a connection
            connection = DriverManager.getConnection(url);
                    }
        return connection;
    }

    public static void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
