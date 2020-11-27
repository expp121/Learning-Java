import java.util.Calendar;
import java.util.GregorianCalendar;
/*
 * CalendarDemo
 */
public class CalendarDemo {

    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar();
        System.out.println("YEAR: " + now.get(GregorianCalendar.YEAR));
        System.out.println("MONTH: " + now.get(GregorianCalendar.MONTH));
        System.out.println("WEEK OF THE YEAR: " + now.get(GregorianCalendar.WEEK_OF_YEAR));
        System.out.println("WEEK OF THE MONTH: " + now.get(GregorianCalendar.WEEK_OF_MONTH));
        System.out.println("DATE: " + now.get(GregorianCalendar.DATE));
        System.out.println("DAY OF THE MONTH: " + now.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println("DAY OF THE YEAR: " + now.get(GregorianCalendar.DAY_OF_YEAR));
        System.out.println("DAY OF THE WEEK: " + now.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("AM_PM: " + now.get(GregorianCalendar.AM_PM));
        System.out.println("HOUR: " + now.get(Calendar.HOUR));
        System.out.println("HOUR OF THE DAY: " + now.get(GregorianCalendar.HOUR_OF_DAY));
        System.out.println("MINUTE: " + now.get(GregorianCalendar.MINUTE));
        System.out.println("SECONDS: " + now.get(GregorianCalendar.SECOND));
        System.out.println("MILISECONDS: " + now.get(GregorianCalendar.MILLISECOND));


    }
    
}