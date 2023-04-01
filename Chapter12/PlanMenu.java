package Chapter12;

import javax.swing.JOptionPane;

public class PlanMenu {
    public static void main(String[] args) {
        Menu briefMenu = new Menu();
        PickMenu entree = null;
        String guestChoice = new String();
        try {
            PickMenu selection = new PickMenu(briefMenu);
            entree = selection;
            guestChoice = selection.getGuestChoice();
        }
        catch (Exception e) {
            guestChoice = "an invalid selection";
        }
        JOptionPane.showMessageDialog(null, "You chose " + guestChoice);

    }
}
