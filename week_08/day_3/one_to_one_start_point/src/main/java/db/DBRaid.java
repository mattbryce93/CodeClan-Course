package db;

import models.Pirate;
import models.Raid;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBRaid {

    private static Session session;
    private static Transaction transaction;

    public static List<Pirate> getRaidPirates(Raid raid){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Pirate> results = null;
        try {
            Criteria cr = session.createCriteria(Pirate.class);
            cr.createAlias("raids", "raid");
            cr.add(Restrictions.eq("raid.id", raid.getId()));
            results = cr.list();
        } catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }
}
