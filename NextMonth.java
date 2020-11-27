/**
 * NextMonth
 */
import java.util.GregorianCalendar;

public class NextMonth {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        System.out.println(today.getMaximum(GregorianCalendar.DAY_OF_MONTH) - today.get(GregorianCalendar.DAY_OF_MONTH));

    }
    
}