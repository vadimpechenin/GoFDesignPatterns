import adapter.extendVariant.RoundHole;
import adapter.extendVariant.RoundPeg;
import adapter.extendVariant.SquarePeg;
import adapter.extendVariant.SquarePegAdapter;
import adapter.implementVariant.CardReader;
import adapter.implementVariant.MemoryCard;
import adapter.implementVariant.USB;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import singleton.User;
import singleton.UserService;

import java.util.ArrayList;

import static org.testng.Assert.*;

/**
 * Класс для тестирования методов паттерна "адаптер".
 * @autor Печенин Вадим
 * @version 1.0
 */
public class AdapterTest {

        @BeforeSuite
        public void createApplication() {
            System.out.println("****Тесты для методов Адаптера****");
        }

        @Test
        public void test(){
            System.out.println("Адаптер объектов");
            USB cardReader = new CardReader(new MemoryCard());
            cardReader.connectWithUsbCable();

            System.out.println("Адаптер классов");
            RoundHole hole = new RoundHole(5.7);
            RoundPeg rpeg = new RoundPeg(5.7);
            assertTrue(hole.fits(rpeg));// true


            SquarePeg small_sqpeg = new SquarePeg(2.0);
            SquarePeg large_sqpeg = new SquarePeg(10.0);
            //hole.fits(small_sqpeg) // ошибка компиляции, несовместимые типы

            SquarePegAdapter small_sqpeg_adapter = new SquarePegAdapter(small_sqpeg);
            SquarePegAdapter large_sqpeg_adapter = new SquarePegAdapter(large_sqpeg);
            assertTrue(hole.fits(small_sqpeg_adapter)); // true
            assertFalse(hole.fits(large_sqpeg_adapter)); // false
        }

        @AfterSuite
        public void reportReady() {
            System.out.println("****Завершены тесты для методов Адаптера****");
        }
}
