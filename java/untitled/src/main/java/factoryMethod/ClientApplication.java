package factoryMethod;

import java.util.Objects;

public class ClientApplication {
    public Dialog dialog;
    public Config config;

    public static class Config{
        public String OS;

        public Config(String OS) {
            this.OS = OS;
        }
    }

    // Приложение создаёт  определённую  фабрику  в  зависимости
    // от конфигурации или окружения.
    private void initialize(){
        config = readApplicationConfigFile();
        if (Objects.equals(config.OS, "Windows")) {
            dialog = new WindowsDialog();
        }else if (Objects.equals(config.OS, "Web")){
            dialog = new WebDialog();
        }else{
            System.out.println("Error! Unknown operation system.");
        }
    }

    public void main() {
        initialize();
        dialog.renderWindow();
    }

    private Config readApplicationConfigFile(){

        int number = (int) Math.round(Math.random());
        String OSName;
        if (number == 0){
            OSName = "Windows";
        }else{
            OSName = "Web";
        }

        return new Config(OSName);
    }

}
