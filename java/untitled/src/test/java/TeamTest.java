import team.Application;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Класс для тестирования методов паттерна "цепочка ответственности".
 * @autor Печенин Вадим
 * @version 1.0
 */
public class TeamTest {
        //Класс собственно для тестирования разработанного фукнционала класса Application

        @BeforeSuite
        public void createApplication() {
            System.out.println("****Тесты для методов класса Application****");
        }

        @Test
        public void testApplicaion(){
            Application app = new Application();
            app.createUI();
        }

        @AfterSuite
        public void reportReady() {
            System.out.println("****Завершены тесты для методов класса Application****");
        }
}
