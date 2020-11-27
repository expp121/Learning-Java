/**
 * Pay
 */
import javax.swing.JOptionPane;

public class Pay {

    public static void main(String[] args) {
        byte hoursWorked, overtimeHours, skillLevel = 0, insuranceType = 0, grossPay = 127;
        float hourlyPayRate = 0f, costOfInsurance = 0 , overtimePay = 0f , regPlusOvertimePay = 0f, grosspayPrice =0f;

        skillLevel = Byte.parseByte(JOptionPane.showInputDialog(null,
        "       Choose one of the following\n" +
        "Skill Level         Hourly Pay Rate($)\n" + 
        "       1                           17,00\n" +
        "       2                           20,00\n" + 
        "       3                           22,00", "" ,JOptionPane.QUESTION_MESSAGE));

        switch (skillLevel) {
            case 1:
                hourlyPayRate = 17.0f;
                break;
        
            case 2: 
                hourlyPayRate = 20.00f;
                break;

            case 3:
                hourlyPayRate = 22.00f;
                break;

            default:
                break;
        }

        hoursWorked = Byte.parseByte(JOptionPane.showInputDialog(null,"Enter the hours worked in the week."));

        overtimeHours = (byte)(hoursWorked > 40 ? hoursWorked -40 : 0);
        overtimePay = overtimeHours > 0 ? overtimeHours * hourlyPayRate * 1.5f : 0f ;
        regPlusOvertimePay = (hoursWorked - overtimeHours * hourlyPayRate) + overtimePay;
        
        if (skillLevel == 2 || skillLevel ==3 )
        {
            insuranceType = Byte.parseByte(JOptionPane.showInputDialog(null,
            "       Please choose the type of insurance you want\n" +
            "Option             Explanation                     Weekly Cost to Employee($)\n" + 
            "    1           Medical insurance                                       32,50\n" + 
            "    2           Dental insurance                                          20,00\n" +
            "    3           Long-term disabiltiy insurance                 10,00" ));

            switch (insuranceType) {
                case 1:
                    costOfInsurance = 32.50f;
                    break;
                
                case 2:
                    costOfInsurance = 20.00f;
                    break;
            
                case 3:
                    costOfInsurance = 10.00f;
                    break;

                default:
                    costOfInsurance = 0f;
                    break;
            }
        }

        if (skillLevel == 3) grossPay = (byte)(JOptionPane.showConfirmDialog(null, "Do you want to participate in the retirement plan at 3% of your gross pay?"));
        
        if (grossPay == JOptionPane.YES_OPTION)
            grosspayPrice = regPlusOvertimePay * 0.03f;
        
        JOptionPane.showMessageDialog(null, 
        "You have worked for " + hoursWorked + " hours\n" +
        "The hourly pay rate is " + hourlyPayRate + "$\n"+
        "Your regular pay for 40 hours is " + 40 * hourlyPayRate + "$\n" +
        "Your overtime pay will be " + overtimePay + "$\n" +
        "Regular + overtime will be " + regPlusOvertimePay + "$\n" + 
        "Deductions " + costOfInsurance + "$\n");
    }
}