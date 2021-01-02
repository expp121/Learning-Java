import javax.swing.JOptionPane;
import com.vehicleswesale.vehicle.*;

public class VehicleDataBase {

    public static void main(String args[]) {
        Vehicle[] vehicles = new Vehicle[5];
        int x;
        for (x = 0; x < vehicles.length; x++) {
            String userEntry;
            int vehicleType;
            userEntry = JOptionPane.showInputDialog(null,
                    "Please select a type of vehicle, you want to enter\n1. SailBoat\n2.Bicycle");
            vehicleType = Integer.parseInt(userEntry);
            if (vehicleType == 1)
                vehicles[x] = new SailBoat();
            else
                vehicles[x] = new Bicycle();
        }

        StringBuffer outString = new StringBuffer();
        for ( x = 0; x < vehicles.length; x++)
            outString.append("\n#" + x+1 + " " + vehicles[x].toString());
        JOptionPane.showMessageDialog(null, "Our available vehicles include:\n" + outString);  
    }

}
