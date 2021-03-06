import javax.swing.JOptionPane;

public class Bicycle extends Vehicle{
    public Bicycle(){
        super("a person", 2);
    }

    public void setPrice(){
        String entry;
        final int MAX = 4000;
        entry = JOptionPane.showInputDialog(null, "Enter bicycle price ");
        super.price = Integer.parseInt(entry);
        if (super.price > MAX) {
            super.price = MAX;
        }
    }

    public String toString(){
        return("The bicycle is powered by " + getPowerSource() + "; it has " + getWheels() + " wheels and costs $" + getPrice());
    }
}
