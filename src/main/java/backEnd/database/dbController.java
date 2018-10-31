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
    SessionFactory factory;


    public dbController(){
        System.out.println("dzialam dbController");
        factory = new Configuration().configure().buildSessionFactory();



    }

    public List getRecords(String p_Table_Name) {



        Session session = factory.openSession();
        Transaction tx = null;
        List list = null;
        try {
            tx = session.beginTransaction();
            list = session.createQuery("FROM " + p_Table_Name).list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return list;

    }
}
