package sk.akademiasovy.library;

import sk.akademiasovy.library.entity.Writer;
import org.hibernate.SessionFactory;
import org.hibernate.SessionBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    public static SessionFactory getSession(){
        return session;
    }
    private static SessionFactory session=HibernateUtil.buildSession();
    private static SessionFactory buildSession(){
        Configuration configuration=new Configuration();
        configuration.addAnnotatedClass(Writer.class);
        return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
    }
}
