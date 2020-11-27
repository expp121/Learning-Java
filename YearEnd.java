import java.util.GregorianCalendar;

public class YearEnd{
    
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();

        System.out.println("Days until next year: " + (today.getMaximum(GregorianCalendar.DAY_OF_YEAR) - today.get(GregorianCalendar.DAY_OF_YEAR)));
    }
}