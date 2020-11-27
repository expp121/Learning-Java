import javax.swing.JOptionPane;

public class ProjectedSales
{
    public static void main(String[] args) {
        final float PERCENT=0.10F;

        float northDivision=Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the year's sales total in dollars for the North Division")),
        southDivision=Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the year's sales total in dollars for the South Division"));
        JOptionPane.showMessageDialog(null,"Next year's projected sales for the North Division are: "+northDivision*PERCENT+"\nAnd for the South Division: "+southDivision*PERCENT);
    }
}