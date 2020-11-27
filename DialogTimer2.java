import javax.swing.JOptionPane;
import java.util.GregorianCalendar;

/**
 * DialogTimer
 */
public class DialogTimer2 {
    public static final short MILISECONDS_IN_SECOND = 1000;
    public static void main(String[] args) {

        byte time1Seconds, time2Seconds, time1Minutes, time2Minutes, time1Hours, time2Hours;
        short time1Miliseconds, time2Miliseconds;
        int timeDifferenceInMiliseconds, timeDifferenceInSeconds, timeDifferenceInMinutes, timeDifferenceInHours;
        GregorianCalendar time1 = new GregorianCalendar();
        
        time1Miliseconds = (short)time1.get(GregorianCalendar.MILLISECOND);
        time1Seconds = (byte)time1.get(GregorianCalendar.SECOND);
        time1Minutes = (byte)time1.get(GregorianCalendar.MINUTE);
        time1Hours = (byte)time1.get(GregorianCalendar.HOUR_OF_DAY);
        
        JOptionPane.showConfirmDialog(null, "Is Stealing ever justified ?");
        
        GregorianCalendar time2 = new GregorianCalendar();
        
        time2Miliseconds = (short)time2.get(GregorianCalendar.MILLISECOND);
        time2Seconds = (byte)time2.get(GregorianCalendar.SECOND);
        time2Minutes = (byte)time2.get(GregorianCalendar.MINUTE);
        time2Hours = (byte)time2.get(GregorianCalendar.HOUR_OF_DAY);
        
        timeDifferenceInMiliseconds = time2Miliseconds - time1Miliseconds;
        timeDifferenceInSeconds = time2Seconds - time1Seconds;
        timeDifferenceInMinutes = time2Minutes - time1Minutes;
        timeDifferenceInHours = time2Hours - time1Hours;
        

        if(timeDifferenceInMiliseconds>0) 
        {
            if(timeDifferenceInSeconds>0)
            {    
                if(timeDifferenceInMinutes>0)
                {
                    if (timeDifferenceInHours>0)
                    {    
                        JOptionPane.showMessageDialog(null, "It took you " + timeDifferenceInHours + "H:" + timeDifferenceInMinutes + "M:" 
                        + timeDifferenceInSeconds + "S:" + timeDifferenceInMiliseconds + "MIL to answer.");
                    }
                    else JOptionPane.showMessageDialog(null, "It took you " + timeDifferenceInMinutes + "M:" 
                        + timeDifferenceInSeconds + "S:" + timeDifferenceInMiliseconds + "MIL to answer.");
                }
                else JOptionPane.showMessageDialog(null, "It took you " + timeDifferenceInSeconds + "S:" + timeDifferenceInMiliseconds + "MIL to answer.");
            }
            else JOptionPane.showMessageDialog(null, "It took you " + timeDifferenceInMiliseconds + "MIL to answer.");       
        }
    }
}