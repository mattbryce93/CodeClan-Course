package db;

import models.Pirate;
import models.Raid;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBRaid {

    private static Session session;

    public static List<Pirate> getRaidPirates(Raid raid){
        List<Pirate> results = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Criteria cr = session.createCriteria(Pirate.class);
            cr.createAlias("raids", "raid"); // ADDED
            cr.add(Restrictions.eq("raid.id", raid.getId())); // ADDED
            results = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;

    }
}
