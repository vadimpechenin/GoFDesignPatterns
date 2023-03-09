package decorator;


import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * Конкретные декораторы добавляют что-то своё к базовому
 * поведению обёрнутого компонента.
 */
public class EncyptionDecorator extends DataSourceDecorator{
    public EncyptionDecorator(DataSourse sourse) {
        super(sourse);
    }

    public void writeData(String data) throws Exception {
        // 1. Зашифровать поданные данные.
        // 2. Передать зашифрованные данные в метод writeData
        // обёрнутого объекта (wrappee).
        String strData="";
        String strKey = "Ключ";
        try {
            SecretKeySpec skeyspec=new SecretKeySpec(strKey.getBytes(),"Blowfish");
            Cipher cipher= Cipher.getInstance("Blowfish");
            cipher.init(Cipher.ENCRYPT_MODE, skeyspec);
            byte[] encrypted=cipher.doFinal(data.getBytes());
            strData=new String(encrypted);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        wrappee.writeData(strData);
        System.out.println("Записали данные в декораторе");
    }

    public String readData() throws Exception {
        // 1. Получить данные из метода readData обёрнутого
        // объекта (wrappee).
        // 2. Расшифровать их, если они зашифрованы.
        // 3. Вернуть результат.
        String strData="";
        String strKey = "Ключ";
        try {
            SecretKeySpec skeyspec=new SecretKeySpec(strKey.getBytes(),"Blowfish");
            Cipher cipher=Cipher.getInstance("Blowfish");
            cipher.init(Cipher.DECRYPT_MODE, skeyspec);
            String strEncrypted = wrappee.readData();
            byte[] decrypted=cipher.doFinal(strEncrypted.getBytes());
            strData=new String(decrypted);

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }
        System.out.println("Вернули данные из декоратора");
        return strData;

    }
}
