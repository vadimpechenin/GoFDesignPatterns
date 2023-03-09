import abstractFactory.Application;
import abstractFactory.ApplicationConfigurator;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import singleton.User;
import singleton.UserService;

import java.util.ArrayList;
import java.util.Objects;

import static org.testng.Assert.assertEquals;

/**
 * Класс для тестирования методов паттерна "синглтон".
 * @autor Печенин Вадим
 * @version 1.0
 */
public class SingletonTest {

        @BeforeSuite
        public void createApplication() {
            System.out.println("****Тесты для методов класса Database****");
        }

        @Test
        public void test(){
            for (int index=0; index<3; index++){
                String userLogin = "login";
                String password = "password";

                ArrayList<User> users = new ArrayList<>();
                UserService.GetUsers(userLogin, password, users);
                User user = users.get(0);

                System.out.println("Сделано");
                assertEquals("1",user.ID);
            }
        }

        @AfterSuite
        public void reportReady() {
            System.out.println("****Завершены тесты для методов класса Database****");
        }
}
