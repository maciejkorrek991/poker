package backEnd.database;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;

import java.util.List;

public class dbController {
    SessionFactory factory;
    Transaction tx = null;

    public dbController(){
        System.out.println("dzialam dbController");
        factory = new Configuration().configure().buildSessionFactory();



    }
    public int getMaxDrawId(){

        Session session = factory.openSession();
        Draws oldest = null;
        try {
            tx = session.beginTransaction();
            oldest =
                    (Draws) session.createCriteria(Draws.class)
                            .addOrder(Order.desc("draw_id"))
                            .setMaxResults(1)
                            .uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    return oldest.getDraw_id();
    }

    public List getRecords(String p_Table_Name, String p_additional_stmt) {



        Session session = factory.openSession();
        List list = null;
        try {
            tx = session.beginTransaction();
            list = session.createQuery("FROM " + p_Table_Name + " " + p_additional_stmt).list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }


        return list;

    }

    public void insertInto(Object p_Object){
        Session session = factory.openSession();
        Transaction tx = session.getTransaction();
        session.beginTransaction();
        try {
            session.save(p_Object);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }
}
