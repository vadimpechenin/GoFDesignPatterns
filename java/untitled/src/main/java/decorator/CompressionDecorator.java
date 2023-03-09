package decorator;


import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * Декорировать можно не только базовые компоненты, но и уже
 * обёрнутые объекты.
 */
public class CompressionDecorator extends DataSourceDecorator{

    public CompressionDecorator(DataSourse sourse) {
        super(sourse);
    }

    public void writeData(String data) throws Exception {
        // 1. Запаковать поданные данные
        // 2. Передать запакованные данные в метод writeData
        // обёрнутого объекта (wrappee).
        int counter=1;
        StringBuilder out= new StringBuilder();
        char[] input = data.toCharArray();
        char letter=input[0];
        for(int i=1;i<input.length;i++){
            if(input[i]==letter && counter<9){
                counter++;
            }
            else{
                out.append(letter);
                if(counter>1) out.append(Integer.toString(counter));
                counter=1;
            }
            letter=input[i];
        }
        out.append(letter);
        if(counter>1) {
            out.append(Integer.toString(counter));
        }
        wrappee.writeData(out.toString());
    }

    public String readData() throws Exception {
        // 1. Получить данные из метода readData обёрнутого
        // объекта (wrappee).
        // 2. Распаковать их, если они запакованы.
        // 3. Вернуть результат.

        String strCompression = wrappee.readData();

        return strCompression;
    }
}
