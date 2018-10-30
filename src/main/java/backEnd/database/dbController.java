package backEnd.database;


import backEnd.engine.Props.Card;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.sql.*;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class dbController {

    public dbController(){
        System.out.println("dzialam dbController");
        testConnection();


    }

    private void testConnection() {
        /*
        String url = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=admin&ssl=true";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Statement stmt = null;
        stmt = conn.createStatement();
        String sql = "select id_karty from game.cards";
        ResultSet rs = stmt.executeQuery(sql);
        //STEP 5: Extract data from result set
        while(rs.next()){
            //Retrieve by column name
            int id  = rs.getInt("id_karty");


            //Display values
            System.out.print("ID: " + id);

        }
        rs.close();

        */

        SessionFactory factory = new Configuration().configure().buildSessionFactory();



        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            List cards = session.createQuery("FROM Card").list();
            for (Iterator iterator = cards.iterator(); iterator.hasNext();){
                Card card = (Card) iterator.next();
                System.out.print("Card_id: " + card.getCard_id());
                System.out.print("Value: " + card.getValue());
                System.out.println("Suit: " + card.getSuit());
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }
}
