package db;

import models.Pirate;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DBPirate {

    private static Session session;
    private static Transaction transaction;

    public static void save(Pirate pirate) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(pirate);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

//    public static List<Pirate> getAll(){
//        session = HibernateUtil.getSessionFactory().openSession();
//
//        try {
//
//        } catch(HibernateException e){
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//    }
}
