import dao.daoDeveloper;
import dao.daoFranchise;
import dao.daoGame;
import model.Developer;
import model.Franchise;
import model.Game;
import model.Publisher;
import dao.daoPublisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by overl on 21.03.2017.
 */
public class Test {
    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "953111");

        daoDeveloper daoDev = new daoDeveloper(con);
        Developer dev = daoDev.select(1);
        System.out.println("Developer");
        System.out.println(" id: " + dev.getId() + ".\n pub_id_dev: " + dev.getPubIdDev() +
                ".\n name: " + dev.getName() + ".\n surname: " + dev.getSurname()+
                ".\n position: "+ dev.getPosition() + ". \n efficiency: "+ dev.getEfficiency() + ".");


        daoPublisher daoPub = new daoPublisher(con);
        Publisher pub = daoPub.select(1);
        System.out.println("\nPublisher");
        System.out.println(" id: "+ pub.getId() + ".\n name: "+ pub.getName() +
                ".\n founded: "+ pub.getDate() + ".\n headqurters: " + pub.getHeadquarters());

        daoFranchise daoFranch = new daoFranchise(con);
        Franchise franch = daoFranch.select(1);
        System.out.println("\nFranchise");
        System.out.println(" id: " + franch.getId() + ".\n name: " + franch.getName() +
                ". \n founded: " + franch.getDate() +".\n pub_id_franch: " + franch.getPubIdFranch());

        daoGame daoGame =new daoGame(con);
        Game game = daoGame.select(1);
        System.out.println("\nGame");
        System.out.println(" id: " + game.getId() + ".\n franch_id: " + game.getFranchId() +
                ".\n title: " + game.getTitle() + ".\n sold: " + game.getSold() +
                ".\n tax: " + game.getTax() + ".\n price: " + game.getPrice());

        con.close();
    }
}
