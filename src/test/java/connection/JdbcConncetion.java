package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConncetion {
    private Connection connection = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/postgres", "postgres", "1381Iran");

    public JdbcConncetion() throws SQLException {
    }

    public Connection getConnection() {
        return connection;
    }
}
