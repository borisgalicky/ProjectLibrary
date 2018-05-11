package sk.akademiasovy.library;

import sk.akademiasovy.library.entity.Book;
import sk.akademiasovy.library.entity.Writer;
import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        Session session=HibernateUtil.getSession().openSession();
        Writer writer=new Writer();
        writer.setFirstName("Hans Christian");
        writer.setLastName("Andersen");
        Book book1=new Book();
        book1.setName("Snehová kráľovná");
        book1.setYear(1844);
        //writer.getBooks().add(book1);
        session.beginTransaction();
        session.save(writer);
        session.getTransaction().commit();
        session.close();
    }
}
