package decorator;


/**
 * Вариант 2. Клиентский код, использующий внешний источник
 * данных. Класс SalaryManager ничего не знает о том как
 * именно будут считаны и записаны данные. Он получает уже
 * готовый источник данных.
 */
public class SalaryManager {
    private DataSourse sourse;

    public SalaryManager(DataSourse sourse) {
        this.sourse = sourse;
    }

    public String load() throws Exception {
        return sourse.readData();
    }

    public void save(String salaryRecords) throws Exception {
        sourse.writeData(salaryRecords);
    }
    // ...Остальные полезные методы...
}
