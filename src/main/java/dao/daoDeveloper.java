package dao;

import model.Developer;

import java.sql.*;

/**
 * Created by overl on 21.03.2017.
 */
public class daoDeveloper {

    private Connection con;
    private static PreparedStatement prstmt;
    private static ResultSet rs;

    public daoDeveloper(Connection con){
        this.con = con;
    }

    public void create(Developer dev){
        String query = "insert into developer(id,pub_id_dev,name,surname,position,efficiency) values(?,?,?,?,?,?)";

        try {
            prstmt = con.prepareStatement(query);
            prstmt.setLong(1,dev.getId());
            prstmt.setLong(2,dev.getPubIdDev());
            prstmt.setString(3,dev.getName());
            prstmt.setString(4,dev.getSurname());
            prstmt.setString(5,dev.getPosition());
            prstmt.setLong(6,dev.getEfficiency());
            prstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try { prstmt.close(); } catch(SQLException se) { /*can't do anything */ }
        }

    }

    public Developer select(int id){
        Developer dev = new Developer();
        String query = "select id,pub_id_dev,name,surname,position,efficiency from developer where id = ?";

        try {
            prstmt = con.prepareStatement(query);
            prstmt.setLong(1,id);
            rs = prstmt.executeQuery();

            if(rs.next()){
                dev.setId(rs.getInt(1));
                dev.setPubIdDev(rs.getLong(2));
                dev.setName(rs.getString(3));
                dev.setSurname(rs.getString(4));
                dev.setPosition(rs.getString(5));
                dev.setEfficiency(rs.getInt(6));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try { prstmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }

        return dev;
    }

    public void delete(int id){
        String query = "delete from developer where id = ?";

        try {
            prstmt = con.prepareStatement(query);
            prstmt.setLong(1,id);
            prstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try { prstmt.close(); } catch(SQLException se) { /*can't do anything */ }
        }
    }

    public void update(Developer dev){
        String query = "update developer set id=?, pub_id_dev=?, name=?, surname=?, position=?, efficiency=? where id=?";

        try {
            prstmt = con.prepareStatement(query);
            prstmt.setLong(1,dev.getId());
            prstmt.setLong(2,dev.getPubIdDev());
            prstmt.setString(3,dev.getName());
            prstmt.setString(4,dev.getSurname());
            prstmt.setString(5,dev.getPosition());
            prstmt.setLong(6,dev.getEfficiency());
            prstmt.setLong(7,dev.getId());
            prstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try { prstmt.close(); } catch(SQLException se) { /*can't do anything */ }
        }
    }
}
