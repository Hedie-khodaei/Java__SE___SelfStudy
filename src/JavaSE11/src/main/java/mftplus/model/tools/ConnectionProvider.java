package mftplus.model.tools;

import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
   // singleton
    @Getter
    private static ConnectionProvider provider = new ConnectionProvider();

    public ConnectionProvider() {
    }


    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE ",
                " javase ",
                " java123"
        );
    }
}
