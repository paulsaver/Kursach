package dao;

import model.Publisher;

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
    private static ResultSet rs;

    public daoPublisher(){
    }

    public static void create(Publisher pub){
        String query = "insert into publisher(id,name,founded,headquarters) values(?,?,?,?)";

        try {
            con = DriverManager.getConnection(url, user, password);
            prstmt = con.prepareStatement(query);
            prstmt.setLong(1,pub.getId());
            prstmt.setString(2,pub.getName());
            prstmt.setString(3,pub.getDate());
            prstmt.setString(4,pub.getHeadquarters());
            prstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { prstmt.close(); } catch(SQLException se) { /*can't do anything */ }
        }

    }

    public static Publisher select(int id){
        Publisher pub = new Publisher();
        String query = "select id,name,founded,headquarters from publisher where id = ?";

        try {
            con = DriverManager.getConnection(url, user, password);
            prstmt = con.prepareStatement(query);
            prstmt.setLong(1,id);
            rs = prstmt.executeQuery();

            if(rs.next()){
                pub.setId(rs.getInt(1));
                pub.setName(rs.getString(2));
                pub.setDate(rs.getString(3));
                pub.setHeadquarters(rs.getString(4));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { prstmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }

        return pub;
    }

    public static void delete(int id){
        String query = "delete from publisher where id = ?";

        try {
            con = DriverManager.getConnection(url, user, password);
            prstmt = con.prepareStatement(query);
            prstmt.setLong(1,id);
            prstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { prstmt.close(); } catch(SQLException se) { /*can't do anything */ }
        }
    }

}
