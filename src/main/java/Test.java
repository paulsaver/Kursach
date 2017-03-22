import model.Publisher;
import dao.daoPublisher;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by overl on 21.03.2017.
 */
public class Test {
    public static void main(String[] args) {
        Date now = new Date();
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        String mysqlDateString = formatter.format(now);

        /*Publisher pub = new Publisher();
        pub.setId(100);
        pub.setName("Test Pub");
        pub.setDate("1999-11-23");
        pub.setHeadquarters("Test headquarters");

        daoPublisher.create(pub);*/

        Publisher pub = daoPublisher.select(2);
        System.out.println("Publisher");
        System.out.println("id: "+ pub.getId() + ". name: "+ pub.getName() + ". founded: "+ pub.getDate() + ". headqurters: " + pub.getHeadquarters());
    }
}
