import abstractFactory.Application;
import abstractFactory.ApplicationConfigurator;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.Objects;

import static org.testng.Assert.assertEquals;

/**
 * Класс для тестирования методов паттерна "фабричный метод".
 * @autor Печенин Вадим
 * @version 1.0
 */
public class AbstractFactoryTest {
        //Класс собственно для тестирования разработанного фукнционала класса ClientApplication

        @BeforeSuite
        public void createApplication() {
            System.out.println("****Тесты для методов класса Application****");
        }

        @Test
        public void testRenderWindow(){
            System.out.println("Тестируем абстрактную фабрику");
            for (int index=0; index<3; index++){
                ApplicationConfigurator appConfig = new ApplicationConfigurator();
                Application app = appConfig.main();
                boolean result = false;
                if (Objects.equals(appConfig.config.OS, "Windows")) {
                    assertEquals("paint Windows", app.paint());
                }else if (Objects.equals(appConfig.config.OS, "macOS")){
                    assertEquals("paint macOS", app.paint());
                }else{
                    System.out.println("Error! Unknown operation system.");
                }
            }
        }

        @AfterSuite
        public void reportReady() {
            System.out.println("****Завершены тесты для методов класса Application****");
        }
}
