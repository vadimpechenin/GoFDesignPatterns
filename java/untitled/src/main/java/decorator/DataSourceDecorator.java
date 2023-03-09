package decorator;


import java.io.IOException;

/**
 * Родитель всех декораторов содержит код обёртывания.
 */
public class DataSourceDecorator implements DataSourse {
    protected DataSourse wrappee;

    public DataSourceDecorator(DataSourse sourse) {
        this.wrappee = sourse;
    }

    @Override
    public void writeData(String data) throws Exception {
        wrappee.writeData(data);
    }

    @Override
    public String readData() throws Exception {
        return wrappee.readData();
    }
}
