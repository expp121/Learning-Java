import javax.swing.JOptionPane;
public class FahrenheitToCelsius
{
    public static void main(String[] args) {
        float fahrenheit;
        fahrenheit=Float.parseFloat(JOptionPane.showInputDialog(null, "Enter a temperature in Fahrenheit"));
        JOptionPane.showMessageDialog(null,"The temperature in FAHRENHEIT is : "+fahrenheit+ "\n"+
        "The temperatre in CELSIUS is: "+ ((fahrenheit-32.0)*(5/9.0)) );
        
    }
}