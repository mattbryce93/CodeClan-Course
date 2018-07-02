package db;

import models.Golfer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBGolfer {

    private static Session session;
    private static Transaction transaction;

    public static void save(Golfer golfer){
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(golfer);
            transaction.commit();
        } catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static List<Golfer> getAll() {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Golfer> results = null;
        try {
            Criteria criteria = session.createCriteria(Golfer.class);
            results = criteria.list();
        } catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    public static Golfer find(int id) {
        Golfer result = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Criteria criteria = session.createCriteria(Golfer.class);
            criteria.add(Restrictions.eq("id", id));
            result = (Golfer)criteria.uniqueResult();
        } catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

    public static void delete(Golfer golfer) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.delete(golfer);
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }


    public static void deleteAll() {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Criteria criteria = session.createCriteria(Golfer.class);
            List<Golfer> results = criteria.list();
            transaction = session.beginTransaction();
            for (Golfer golfer : results){
                session.delete(golfer);
            }
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
