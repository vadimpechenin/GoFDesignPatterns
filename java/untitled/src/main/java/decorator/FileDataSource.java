package decorator;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Один из конкретных компонент, реализует
 * базовую функциональность.
 */
public class FileDataSource implements DataSourse{
    private final String fileName;
    private final FileWriter writer;
    private final FileReader reader;

    public FileDataSource(String fileName) throws IOException {
        this.fileName = fileName;
        this.writer = new FileWriter(fileName,false);
        this.reader = new FileReader(fileName);
    }

    @Override
    public void writeData(String data){
        //Записать данные в файл
        try(writer)
        {
            // запись всей строки
            writer.write(data);
            // запись по символам
            //writer.append('\n');
            //writer.append('E');

            writer.flush();
            System.out.println("Записали данные");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        //Прочитать данные из файла
        try(reader)
        {
            char[] chars  = new char[(int)fileName.length()];

            int offset = 0;
            while (offset < chars.length)
            {
                int result = reader.read(chars, offset, chars.length - offset);
                if (result == -1) {
                    break;
                }
                offset += result;
            }
            System.out.println("Вернули данные");
            return new String(chars);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
