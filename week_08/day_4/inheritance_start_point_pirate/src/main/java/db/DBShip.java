package db;

import models.Captain;
import models.Pirate;
import models.Ship;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBShip {

    private static Session session;

    public static List<Pirate> getCrewForShip(Ship ship) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Pirate> results = null;
        try {
            Criteria cr = session.createCriteria(Pirate.class);
            cr.add(Restrictions.eq("ship", ship));
            results =  cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    public static Captain getCaptain(Ship ship){
        session = HibernateUtil.getSessionFactory().openSession();
        Captain captain = null;

        try {
            Criteria cr = session.createCriteria(Captain.class);
            cr.add(Restrictions.eq("ship", ship));
            captain = (Captain)cr.uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return captain;
    }
}
