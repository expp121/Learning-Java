package com.vehicleswesale.vehicle;
import javax.swing.JOptionPane;

public class SailBoat extends Vehicle {
    
    private int length;

    public SailBoat(){
        super("wind", 0);
        setLength();
    }

    public void setLength(){
        String entry;
        entry = JOptionPane.showInputDialog(null, "Enter sailboat length in feet ");
        length = Integer.parseInt(entry);
    }

    public int getLength(){
        return length;
    }

    public void setPrice(){
        String entry;
        final int MAX = 100000;
        entry = JOptionPane.showInputDialog(null, "Enter sailboat price ");
        super.price = Integer.parseInt(entry);
        if(super.price > MAX){
            super.price = MAX;
        }
    }

    public String toString(){
        return("The " + getLength() + " foot sailboot is powered by " 
        + getPowerSource() + "; it has " + getWheels() + " wheels and costs $" + getPrice() );
    }
}
