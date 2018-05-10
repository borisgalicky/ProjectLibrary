package sk.akademiasovy.library;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    public static SessionFactory getSession(){
        return session;
    }
    private static SessionFactory session=HibernateUtil.buildSession();

}
