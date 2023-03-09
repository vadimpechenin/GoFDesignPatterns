package decorator;


/**
 * Приложение может по-разному собирать декорируемые
 * объекты, в зависимости от условий использования.
 */
public class ApplicationConfigurator {
    public String salary;
    public SalaryManager logger;

    public void dumbUsageExample(String salaryRecords, Enabled enabled) throws Exception {
        FileDataSource source = new FileDataSource("D:\\JAVA\\Programms\\GoFDesignPatterns\\java\\untitled\\src\\main\\resources\\somefile.txt");
        if (enabled == Enabled.ENCRYPTION) {
            EncyptionDecorator sourceDecor = new EncyptionDecorator(source);
            logger = new SalaryManager(sourceDecor);
        }
        if (enabled == Enabled.COMPRESSION) {
            CompressionDecorator sourceDecor = new CompressionDecorator(source);
            logger = new SalaryManager(sourceDecor);
        }
        if (enabled == Enabled.SIMPLE) {
            FileDataSource sourceDecor = new FileDataSource("D:\\JAVA\\Programms\\GoFDesignPatterns\\java\\untitled\\src\\main\\resources\\somefile.txt");
            logger = new SalaryManager(sourceDecor);
        }
        logger.save(salaryRecords);
        salary = logger.load();
    }
}
