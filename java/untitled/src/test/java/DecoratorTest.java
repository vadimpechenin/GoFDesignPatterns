import decorator.Application;
import decorator.ApplicationConfigurator;
import decorator.Enabled;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Random;

import static org.testng.Assert.assertEquals;

/**
 * Класс для тестирования методов паттерна "декоратор".
 * @autor Печенин Вадим
 * @version 1.0
 */
public class DecoratorTest {
        //Класс собственно для тестирования разработанного фукнционала класса Application

        @BeforeSuite
        public void createApplication() {
            System.out.println("****Тесты для методов класса Application****");
        }

        @Test
        public void testApplication() throws Exception {
            System.out.println("Тестируем декоратор");
            String[] testData = new String[3];
            testData[0] = "Hello";
            testData[1] = "World";
            testData[2] = "Decorator";
            //byte[] array = new byte[7];
            for (int index=0; index<3; index++){
                //ew Random().nextBytes(array);
                //testData = new String(array, StandardCharsets.UTF_8);
                Application app = new Application();
                app.dumbUsageExample(testData[index]);
            }
        }

        @AfterSuite
        public void reportReady() {
            System.out.println("****Завершены тесты для методов класса Application****");
        }

        @BeforeSuite
        public void createApplicationConfig() {
            System.out.println("****Тесты для методов класса ApplicationConfig****");
        }

        @Test
        public void testApplicationConfiguration() throws Exception {
            System.out.println("Тестируем декоратор Config");
            String[] testData = new String[3];
            testData[0] = "Hello";
            testData[1] = "World";
            testData[2] = "Decorator";
            //byte[] array = new byte[7];
            for (int index=0; index<3; index++){
                //new Random().nextBytes(array);
                //testData = new String(array, StandardCharsets.UTF_8);
                ApplicationConfigurator appConfig = new ApplicationConfigurator();
                appConfig.dumbUsageExample(testData[index], Enabled.SIMPLE);
                System.out.println ("Данные при сохранении:" +  testData[index]);
                System.out.println ("Данные после загрузки:" +  appConfig.salary);
            }
        }

        @AfterSuite
        public void reportReadyAppConfig() {
            System.out.println("****Завершены тесты для методов класса ApplicationConfig****");
        }
}
