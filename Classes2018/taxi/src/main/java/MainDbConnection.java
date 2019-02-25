import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by amour on 25.09.2018.
 */
public class MainDbConnection {
    private static final String USER = "postgres";
    private static final String PASSWORD = "qwerty007";
    private static final String URL_DB = "db_11_702";
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(URL_DB,USER,PASSWORD);
    }
}
