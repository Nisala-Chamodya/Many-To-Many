package lk.manytomany.util;



import lk.manytomany.entity.Lecturer;
import lk.manytomany.entity.Subject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguaration {
        private static  FactoryConfiguaration factoryConfiguaration;
        private final SessionFactory sessionFactory;
        private FactoryConfiguaration(){
                Configuration configuration = new Configuration().configure().addAnnotatedClass(Lecturer.class)
                        .addAnnotatedClass(Subject.class);//xml file eka loard karagannawa
                sessionFactory= configuration.buildSessionFactory();
        }

        public static FactoryConfiguaration getInstance(){
                return (factoryConfiguaration==null) ? factoryConfiguaration=new FactoryConfiguaration()
                        :  factoryConfiguaration;
        }
  public Session getSession() {
                return sessionFactory.openSession();
  }






}
