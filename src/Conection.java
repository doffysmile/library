import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {

    private static final String url = "jdbc:mysql://localhost:3306/library";
    private static final String username = "root";
    private static final String password = "*********";

    private static Connection conn;

    public static Connection getConnection() {

            try {
                if (conn == null) {
                conn = DriverManager.getConnection(url, username, password);
                }else{
                    return conn;

                }
            }catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
            return conn;
    }
}
