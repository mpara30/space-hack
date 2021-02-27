package database;

import java.sql.*;

public class dbConnect {

    public Connection Connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/AppDB", "root", "root");
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }
}
