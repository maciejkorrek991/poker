package backEnd.database;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class dbController {

    public dbController(){
        System.out.println("dzialam dbController");
        testConnection();
        //Configuration.

    }

    public void testConnection(){

        System.out.println("Trying to create a test connection with the database.");
       // Configuration configuration = new Configuration();
        /*configuration.configure("hibernate.cfg.xml");
        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(ssrb.build());
        Session session = sessionFactory.openSession();
        System.out.println("Test connection with the database created successfuly.")*/
    }
}
