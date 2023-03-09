package decorator;


/**
 *  Вариант 1. Простой пример сборки и
 * использования декораторов.
 */
public class Application {
    public void dumbUsageExample(String salaryRecords) throws Exception {
        FileDataSource source = new FileDataSource("D:\\JAVA\\Programms\\GoFDesignPatterns\\java\\untitled\\src\\main\\resources\\somefile.txt");
        source.writeData(salaryRecords);
        // В файл были записаны чистые данные.

        CompressionDecorator sourceCompression = new CompressionDecorator(source);
        sourceCompression.writeData(salaryRecords);
        // В файл были записаны сжатые данные.
        EncyptionDecorator sourceEncyprion = new EncyptionDecorator(sourceCompression);
        // sourceEncyprion — это связка из трёх объектов:
        // Encryption > Compression > FileDataSource
        sourceEncyprion.writeData(salaryRecords);
        // В файл были записаны сжатые и
        // зашифрованные данные.
    }
}
