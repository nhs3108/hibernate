import entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by nhs3108 on 13/09/2017.
 */
public class App {
    public static void main(String args[]) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml").buildSessionFactory();
        Session curSession1 = sessionFactory.openSession();
        Session curSession2 = sessionFactory.openSession();
        curSession1.beginTransaction();
        curSession2.beginTransaction();


        User user = curSession1.load(User.class, "FPLy4QY2");
        System.out.println(user.getUserName());


        sessionFactory.getCache().evictEntityRegion(User.class);

        user = curSession2.load(User.class, "FPLy4QY2");
        System.out.println(user.getUserName());

        curSession1.disconnect();
        curSession2.disconnect();
        curSession1.close();
        curSession2.close();
        sessionFactory.close();
    }
}