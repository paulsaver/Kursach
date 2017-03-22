package dao;

import model.Publisher;
import util.Util;
import java.sql.*;

/**
 * Created by overl on 21.03.2017.
 */
public class daoPublisher {

    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String user = "root";
    private static final String password = "953111";

    private static Connection con;
    private static PreparedStatement prstmt;

    public daoPublisher(){
    }

    public static void create(Publisher pub){
        String query = "insert into publisher(id,name,founded,headquarters) values(?,?,?,?)";

        try {
            con = DriverManager.getConnection(url, user, password);
            prstmt = con.prepareStatement(query);
            prstmt.setLong(1,pub.getId());
            prstmt.setString(2,pub.getName());
            prstmt.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static

}
