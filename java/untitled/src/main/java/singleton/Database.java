package singleton;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Класс для подключения к базе данных
 */
public class Database {
    private static volatile SessionFactory sessionFactory;
    private static final Object sessionFactoryLock = new Object();

    public static SessionFactory getInstance() {
        if (sessionFactory == null)
        {
            synchronized(sessionFactoryLock)
            {
                if (sessionFactory == null)
                {
                    try
                    {
                        Configuration configuration = new Configuration().configure();

                        configuration.addAnnotatedClass(User.class);

                        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                        sessionFactory = configuration.buildSessionFactory(builder.build());
                    }
                    catch (Exception e)
                    {
                        System.out.println("Исключение!" + e);
                    }
                }
            }
        }

        return sessionFactory;
    }

    private Database() {

    }
}
