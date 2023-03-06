package abstractFactory;



import factoryMethod.WebDialog;
import factoryMethod.WindowsDialog;

import java.util.Objects;

/**
 * Приложение выбирает тип и создаёт конкретные фабрики
 * динамически исходя из конфигурации или окружения.
 */
public class ApplicationConfigurator {

    public GUIFactory factory;
    public Config config;

    public static class Config{
        public String OS;

        public Config(String OS) {
            this.OS = OS;
        }
    }

    public Application main(){
        config = readApplicationConfigFile();
        if (Objects.equals(config.OS, "Windows")) {
            factory = new WinFactory();
        }else if (Objects.equals(config.OS, "macOS")){
            factory = new MacFactory();
        }else{
            System.out.println("Error! Unknown operation system.");
        }

        Application app = new Application(factory);
        app.createUI();
        return app;
    }

    private Config readApplicationConfigFile(){

        int number = (int) Math.round(Math.random());
        String OSName;
        if (number == 0){
            OSName = "Windows";
        }else{
            OSName = "macOS";
        }

        return new Config(OSName);
    }
}
