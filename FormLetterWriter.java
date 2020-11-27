/**
 * FormLetterWriter
 */
public class FormLetterWriter {

    public static void displaySalutation(String name) {
        System.out.println("Dear Mr. or Ms. " + name);
    }

    public static void displaySalutation(String firstName, String secondName) {
        System.out.println("Dear " + firstName + " " + secondName);
    }

    public static void main(String[] args) {
        displaySalutation("Bobo", "The Monkey");
        displaySalutation("Rousito");
    }
}