import javax.swing.JOptionPane;

public class Person {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String zipCode;
    private String phoneNumber;

    public void initialize(){
        this.firstName = JOptionPane.showInputDialog(null, "Please enter the first name of the person.");
        this.lastName = JOptionPane.showInputDialog(null, "Please enter the last name of the person.");
        this.streetAddress = JOptionPane.showInputDialog(null, "Please enter the person's street address.");
        this.zipCode = JOptionPane.showInputDialog(null,  "Please enter the person's zip code.");
        this.phoneNumber = JOptionPane.showInputDialog(null,  "Please enter the person's phone number.");
    }

    public void display(){
        System.out.print("First Name: " + this.firstName 
        + "|Last Name: " + this.lastName 
        + "|Street Address: " + this.streetAddress 
        + "|Zip Code: " + this.zipCode
        + "|Phone Number: " + this.phoneNumber);
    }
    
}