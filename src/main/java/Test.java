import org.hibernate.Session;
import util.HibernateUtil;

/**
 * Created by overl on 16.03.2017.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + Oracle");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Publisher publisher = new Publisher();

        publisher.getName();
        session.getTransaction().commit();
    }
}
