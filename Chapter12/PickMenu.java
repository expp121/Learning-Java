package Chapter12;

import javax.swing.JOptionPane;


public class PickMenu {
    private Menu briefMenu;
    private String guestChoice = new String();
    public PickMenu(Menu menu) {
        briefMenu = menu;
        setGuestChoice();
    }
    public String getGuestChoice() {
        return guestChoice;
    }
    public void setGuestChoice() {
        JOptionPane.showMessageDialog(null, "Choose from the following menu:");
        guestChoice = briefMenu.displayMenu();
    }
}
