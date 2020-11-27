import javax.swing.JOptionPane;
public class MilesToFeet
{
    public static void main(String[] args) {
        final float NUMBER_OF_FEET_IN_MILE=5280F;
        float distanceInMile=Float.parseFloat(JOptionPane.showInputDialog(null, "What's the distance between your house and your uncle's house in miles ?"));
        JOptionPane.showMessageDialog(null,"The distance between my house and my uncle's house is "+distanceInMile+ " miles or "+distanceInMile*NUMBER_OF_FEET_IN_MILE+ " feet.");

    }
    
}