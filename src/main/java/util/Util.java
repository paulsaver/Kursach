package util;

import java.sql.*;

/**
 * Created by overl on 22.03.2017.
 */
public class Util {

    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String user = "root";
    private static final String password = "953111";

    private static Connection con;
    private static PreparedStatement stmt;

    public static PreparedStatement getConnection(){
        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.prepareStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stmt;
    }

    public static void closeConnection(){
        try {
            con.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
