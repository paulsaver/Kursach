package dao;

import model.Franchise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by overl on 24.03.2017.
 */
public class daoFranchise {

    private Connection con;
    private static PreparedStatement prstmt;
    private static ResultSet rs;

    public daoFranchise(Connection con){
        this.con = con;
    }

    public void create(Franchise franch){
        String query = "insert into franchise(id,name,founded,pub_id_franchise) values(?,?,?,?)";

        try {
            prstmt = con.prepareStatement(query);
            prstmt.setLong(1,franch.getId());
            prstmt.setString(2,franch.getName());
            prstmt.setString(3,franch.getDate());
            prstmt.setLong(4,franch.getPubIdFranch());
            prstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try { prstmt.close(); } catch(SQLException se) { /*can't do anything */ }
        }

    }

    public Franchise select(int id){
        Franchise franch = new Franchise();
        String query = "select id,name,founded,pub_id_franch from franchise where id = ?";

        try {
            prstmt = con.prepareStatement(query);
            prstmt.setLong(1,id);
            rs = prstmt.executeQuery();

            if(rs.next()){
                franch.setId(rs.getLong(1));
                franch.setName(rs.getString(2));
                franch.setDate(rs.getString(3));
                franch.setPubIdFranch(rs.getLong(4));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try { prstmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }

        return franch;
    }

    public void delete(int id){
        String query = "delete from franchise where id = ?";

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

    public void update(Franchise franch){
        String query = "update franchise set id=?, name=?, founded=?, pub_id_franch=? where id=?";

        try {
            prstmt = con.prepareStatement(query);
            prstmt.setLong(1,franch.getId());
            prstmt.setString(2,franch.getName());
            prstmt.setString(3,franch.getDate());
            prstmt.setLong(4,franch.getPubIdFranch());
            prstmt.setLong(5,franch.getId());
            prstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try { prstmt.close(); } catch(SQLException se) { /*can't do anything */ }
        }

    }
}
