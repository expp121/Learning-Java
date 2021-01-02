
/**
 * InsuredCar
 */
import javax.swing.JOptionPane;

public class InsuredCar extends Vehicle implements Insured {
    private int coverage;

    public InsuredCar() {
        super("gas", 4);
        setCoverage();
    }

    public void setPrice() {
        String entry;
        final int MAX = 60000;
        entry = JOptionPane.showInputDialog(null, "Enter car price");
        super.price = Integer.parseInt(entry);
        if (super.price > MAX)
            super.price = MAX;
        
    }

    public void setCoverage(){
        this.coverage = (int)(super.price * 0.9);
    }

    public int getCoverage(){
        return this.coverage;
    }

    public String toString(){
        return ("The insured car is powered by " + super.getPowerSource() + "; it has " + super.getWheels()
        + " wheels, costs $" + getPrice() + " and is insured for $" + getCoverage());
    }

}