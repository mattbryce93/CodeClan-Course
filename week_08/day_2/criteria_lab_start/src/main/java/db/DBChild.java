package db;

import models.Child;
import org.hibernate.*;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.List;


public class DBChild {

    private static Transaction transaction;
    private static Session session;

    public static Child findByName(String name){
        session = HibernateUtil.getSessionFactory().openSession();
        Child result = null;
        try {
            Criteria cr = session.createCriteria(Child.class);
            cr.add(Restrictions.eq("name", name));
            result = (Child) cr.uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

    public static List<Child> sortByAge(){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Child> results = null;
        try {
            Criteria cr = session.createCriteria(Child.class);
            cr.addOrder(Order.asc("age"));
            results = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    public static List<Child> allVoiceType(String voiceType){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Child> results = null;
        try {
            Criteria cr = session.createCriteria(Child.class);
            cr.add(Restrictions.eq("range", voiceType));
            results = cr.list();
        } catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    public static Double averageAge(){
        session = HibernateUtil.getSessionFactory().openSession();
        Double result = null;
        try {
            Criteria cr = session.createCriteria(Child.class);
            cr.setProjection(Projections.avg("age"));
            result = (Double) cr.uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

    public static Long totalAge(){
        session = HibernateUtil.getSessionFactory().openSession();
        Long result = null;
        try {
            Criteria cr = session.createCriteria(Child.class);
            cr.setProjection(Projections.sum("age"));
            result = (Long) cr.uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

    public static Child getOldest(){
        session = HibernateUtil.getSessionFactory().openSession();
        Child result = null;
        try {
            Criteria cr1 = session.createCriteria(Child.class);
            cr1.setProjection(Projections.max("age"));
            Integer maxAge = (Integer) cr1.uniqueResult();
            Criteria cr2 = session.createCriteria(Child.class);
            cr2.add(Restrictions.eq("age", maxAge));
            result = (Child) cr2.uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

    public static Child getYoungest(){
        session = HibernateUtil.getSessionFactory().openSession();
        Child result = null;
        try {
            Criteria cr1 = session.createCriteria(Child.class);
            cr1.setProjection(Projections.min("age"));
            Integer minAge = (Integer) cr1.uniqueResult();
            Criteria cr2 = session.createCriteria(Child.class);
            cr2.add(Restrictions.eq("age", minAge));
            result = (Child) cr2.uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

}

