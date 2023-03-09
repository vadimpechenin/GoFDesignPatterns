package decorator;

import java.io.IOException;

/**
 * Общий интерфейс компонентов.
 */
public interface DataSourse {

    public void writeData(String data) throws Exception;

    public String readData() throws Exception;
}
