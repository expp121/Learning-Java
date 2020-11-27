import javax.swing.JOptionPane;

/**
 * PaintCalculator
 */
public class PaintCalculator {

    public static void main(String[] args) {
        float lenght,width,height;
        lenght= Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the lenght of the room(feet)."));
        width= Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the width of the room(feet)."));
        height= Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the height of the room(feet)."));
        calcArea(lenght,width,height);
    }
    public static void calcArea(float lenght,float width,float height) {
        float area= (lenght*height)*2 +(width*height)*2;
        float galons;
        galons=calcGalons(area);
        JOptionPane.showMessageDialog(null, "You will need "+ galons +" galons to paint your walls and that will cost you $"+ galons*32.0F);
        
    }
    public static float calcGalons(float area) {
        return area/350; 
        
    }
}