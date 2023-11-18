import bridge.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.Objects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
/**
 * Класс для тестирования методов паттерна "Мост".
 * @autor Печенин Вадим
 * @version 1.0
 */
public class BridgeTest {
        //Класс собственно для тестирования разработанного фукнционала класса ClientApplication

        @BeforeSuite
        public void createApplication() {
            System.out.println("****Тесты для методов класса Remote****");
        }

        @Test
        public void testRenderWindow() {
            System.out.println("Тестируем мост");
            Device tv = new TV();
            Remote remoteTV = new Remote(tv);

            Device radio = new Radio();
            AdvancedRemote remoteRadio = new AdvancedRemote(radio);

            remoteTV.togglePower();
            remoteTV.channelUp();
            assertTrue(tv.isEnabled());
            assertEquals(2,tv.getChannel());

            assertFalse(radio.isEnabled());
            remoteRadio.togglePower();
            assertTrue(radio.isEnabled());
            for (int i=0; i<10; i++){
            remoteRadio.volumeUp();
            }

            remoteRadio.mute();
            assertEquals(0,radio.getVolume());
        }

        @AfterSuite
        public void reportReady() {
            System.out.println("****Завершены тесты для методов класса Remote****");
        }
}
