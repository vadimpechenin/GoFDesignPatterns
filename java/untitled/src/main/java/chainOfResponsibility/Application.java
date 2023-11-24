package chainOfResponsibility;


/**
 * Клиентский код
 */
public class Application {

    public Dialog createUI(){
        Dialog dialog = new Dialog("Budget Reports");
        dialog.wikiPageURL = "http://...";
        Panel panel = new Panel(0,0,400,800);
        panel.modalHelpText = "This panel does ...";
        Button ok = new Button(250, 760, 50, 20, "OK");
        ok.tooltipText = "This is a OK button that...";
        Button cansel = new Button(250, 760, 50, 20, "Cancel");
        cansel.tooltipText = "This is a Cancel button that...";
        panel.add(ok);
        panel.add(cansel);
        dialog.add(panel);
        return dialog;
    }

    public void onF1KeyPress(){
        Dialog dialog = createUI();
        dialog.showHelp();
    }

}
