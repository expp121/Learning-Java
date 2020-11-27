import javax.swing.JOptionPane;
import java.util.GregorianCalendar;

/**
 * DialogTimer
 */
public class DialogTimer {
    public static final short MILISECONDS_IN_SECOND = 1000;
    public static void main(String[] args) {

        int milli1,milli2,sec1,sec2,time1,time2,timeDifference;
        GregorianCalendar beforeDialog = new GregorianCalendar();
        milli1 = beforeDialog.get(GregorianCalendar.MILLISECOND);
        sec1 = beforeDialog.get(GregorianCalendar.SECOND);
        time1 = MILISECONDS_IN_SECOND * sec1 + milli1;
        JOptionPane.showConfirmDialog(null, "Is Stealing ever justified ? ");
        GregorianCalendar afterDialog = new GregorianCalendar();
        milli2 = afterDialog.get(GregorianCalendar.MILLISECOND);
        sec2 = afterDialog.get(GregorianCalendar.SECOND);
        time2 = MILISECONDS_IN_SECOND * sec2 + milli2;
        timeDifference = time2 - time1;
        JOptionPane.showMessageDialog(null, "It took you " + timeDifference + " miliseconds to answer.");
        
    }
}