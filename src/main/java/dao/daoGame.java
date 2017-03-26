package dao;

import model.Game;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by overl on 24.03.2017.
 */
public class daoGame {

    private Connection con;
    private static PreparedStatement prstmt;
    private static ResultSet rs;

    public daoGame(Connection con){
        this.con = con;
    }

    public void create(Game game){
        String query = "insert into game(id,franch_id,title,sold,tax,price) values(?,?,?,?,?,?)";

        try {
            prstmt = con.prepareStatement(query);
            prstmt.setLong(1,game.getId());
            prstmt.setLong(2,game.getFranchId());
            prstmt.setString(3,game.getTitle());
            prstmt.setLong(4,game.getSold());
            prstmt.setLong(5,game.getTax());
            prstmt.setLong(6,game.getPrice());
            prstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try { prstmt.close(); } catch(SQLException se) { /*can't do anything */ }
        }

    }

    public Game select(int id){
        Game game = new Game();
        String query = "select id,franch_id,title,sold,tax,price from game where id = ?";

        try {
            prstmt = con.prepareStatement(query);
            prstmt.setLong(1,id);
            rs = prstmt.executeQuery();

            if(rs.next()){
                game.setId(rs.getLong(1));
                game.setFranchId(rs.getLong(2));
                game.setTitle(rs.getString(3));
                game.setSold(rs.getLong(4));
                game.setTax(rs.getInt(5));
                game.setPrice(rs.getInt(6));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try { prstmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }

        return game;
    }

    public void delete(int id){
        String query = "delete from game where id = ?";

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

    public void update(Game game){
        String query = "update game set id=?, franch_id=?, title=?, sold=?, tax=?, price=? where id=?";

        try {
            prstmt = con.prepareStatement(query);
            prstmt.setLong(1,game.getId());
            prstmt.setLong(2,game.getFranchId());
            prstmt.setString(3,game.getTitle());
            prstmt.setLong(4,game.getSold());
            prstmt.setLong(5,game.getTax());
            prstmt.setLong(6,game.getPrice());
            prstmt.setLong(7,game.getId());
            prstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try { prstmt.close(); } catch(SQLException se) { /*can't do anything */ }
        }
    }
}
