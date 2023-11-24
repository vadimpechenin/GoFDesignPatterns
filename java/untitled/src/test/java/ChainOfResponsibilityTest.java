import chainOfResponsibility.Application;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.Objects;

import static org.testng.Assert.assertEquals;

/**
 * Класс для тестирования методов паттерна "цепочка ответственности".
 * @autor Печенин Вадим
 * @version 1.0
 */
public class ChainOfResponsibilityTest {
        //Класс собственно для тестирования разработанного фукнционала класса Application

        @BeforeSuite
        public void createApplication() {
            System.out.println("****Тесты для методов класса Application****");
        }

        @Test
        public void testApplicaion(){
            Application app = new Application();
            app.onF1KeyPress();
        }

        @AfterSuite
        public void reportReady() {
            System.out.println("****Завершены тесты для методов класса Application****");
        }
}
