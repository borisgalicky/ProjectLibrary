package sk.akademiasovy.library;
import sk.akademiasovy.library.entity.Writer;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;

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
