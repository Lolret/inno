package controllers.repository.connectionManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManagerJdbcImpl implements ConnectionManager {
    private static ConnectionManager connectionManager;

    private ConnectionManagerJdbcImpl() {
    }

    public static ConnectionManager getInstance() {
        if (connectionManager == null) {
            connectionManager = new ConnectionManagerJdbcImpl();
        }
        return connectionManager;
    }

    @Override
    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://ec2-54-246-101-215.eu-west-1.compute.amazonaws.com:5432/dcercrpmh297md?autoReconnect=true&ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory",
                    "fcagdythznpxgf",
                    "67b51709816a88426ef72815a349956d7013ca21c77609bee6a21c153689b0c4");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
