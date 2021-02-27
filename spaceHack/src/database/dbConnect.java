package database;

import java.sql.*;

public class dbConnect {

    public void Connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AppDB", "root", "root");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
