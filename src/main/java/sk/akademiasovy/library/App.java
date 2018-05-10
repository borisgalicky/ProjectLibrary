package sk.akademiasovy.library;

import sk.akademiasovy.library.entity.Writer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println("Hello World!");
        Session session=HibernateUtil.getSession().openSession();
        Writer writer=new Writer();
        writer.setFirstName("Hans Christian");
        writer.setLastName("Andersen");
        session.beginTransaction();
        session.save(writer);
        session.getTransaction().commit();
        session.close();
    }
}
