import factoryMethod.ClientApplication;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.Objects;

import static org.mockito.Mockito.mock;
import static org.testng.Assert.*;

/**
 * Класс для тестирования методов паттерна "фабричный метод".
 * @autor Печенин Вадим
 * @version 1.0
 */
public class FactoryMethodTest {
        //Класс собственно для тестирования разработанного фукнционала класса ClientApplication
        private ArrayList<ClientApplication> applications = new ArrayList<ClientApplication>();


        @BeforeSuite
        public void createApplication() {
            System.out.println("****Тесты для методов класса ClientApplication****");
            applications.add(new ClientApplication());
            applications.add(new ClientApplication());
            applications.add(new ClientApplication());
        }

        @Test
        public void testRenderWindow(){
            System.out.println("Тестируем фабрику");
            //Создание заглушки по базе счетов
            for (ClientApplication application: applications) {
                application.main();
                if (Objects.equals(application.config.OS, "Windows")) {
                    assertEquals("Windows", application.config.OS);
                }else if (Objects.equals(application.config.OS, "Web")){
                    assertEquals("Web", application.config.OS);
                }else{
                    System.out.println("Error! Unknown operation system.");
                }
            }
        }

        @AfterSuite
        public void reportReady() {
            System.out.println("****Завершены тесты для методов класса ClientApplication****");
        }
}
