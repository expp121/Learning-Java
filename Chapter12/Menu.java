package Chapter12;

import javax.swing.JOptionPane;

public class Menu {
    private String[] entreeChoice = { "Rosemary Chicken", "Beef Wellington", "Maine Logster" };
    private String menu = "";
    private int choice;

    public String displayMenu() {
        for (int x = 0; x < entreeChoice.length; x++) {
            menu = menu + "\n" + (x + 1) + " for " + entreeChoice[x];
        }
        String input = JOptionPane.showInputDialog(null, "Type your selection, then press Enter." + menu);
        choice = Integer.parseInt(input);
        return entreeChoice[choice - 1];
    }

}
