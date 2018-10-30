package backEnd.database;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class dbController {

    public dbController(){
        System.out.println("dzialam dbController");
        testConnection();


    }

    private void testConnection() {
        /*String url = "jdbc:postgresql://localhost:5432/postgres";
        Properties props = new Properties();
        props.setProperty("user","postgres");
        props.setProperty("password","admin");
        props.setProperty("ssl","true");
        try {
            Connection conn = DriverManager.getConnection(url,props);
        } catch (SQLException e) {
            e.printStackTrace();
        }

         String url = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=admin&ssl=true";
        try {
            Connection conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        factory.close();



    }
}
