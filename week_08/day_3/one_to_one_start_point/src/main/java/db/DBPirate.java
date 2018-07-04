package db;

import models.Pirate;
import models.Weapon;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBPirate {

    private static Session session;
    private static Transaction transaction;

    public static List<Pirate> orderByAge(){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Pirate> pirates = null;
        try {
            Criteria cr = session.createCriteria(Pirate.class);
            cr.addOrder(Order.desc("age"));
            pirates = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return pirates;
    }

    public static Double getAverageAge(){
        session = HibernateUtil.getSessionFactory().openSession();
        Double average = null;
        try {
            transaction = session.beginTransaction();
            Criteria cr = session.createCriteria(Pirate.class);
            cr.setProjection(Projections.avg("age"));
            average = (Double)cr.uniqueResult();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return average;
    }

    public static List<Weapon> getPirateWeapons(Pirate pirate){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Weapon> weapons = null;
        try {
            transaction = session.beginTransaction();
            Criteria cr = session.createCriteria(Pirate.class);
            cr.createAlias("weapon", "weapon");
            cr.add(Restrictions.eq("weapon.pirate_id", pirate.getId()));
            weapons = cr.list();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return weapons;
    }

}
