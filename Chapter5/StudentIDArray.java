import javax.swing.JOptionPane;

public class StudentIDArray {

    public static void main(String Args[]) {

        short id;
        boolean foundId = false;
        short[] idNumber = { 1234, 5112, 5157, 8869, 1643, 3321, 8864, 1123, 6544, 1876 };
        String[] names = { "Ivan", "Gosho", "Emil", "Dimitar", "Ivailo", "Petur", "Antonio", "Anatoli", "Rumen",
                "Aleksandur" };
        float[] avgGrade = { 4.3f, 4.67f, 5.12f, 6.00f, 5.75f, 3.56f, 3.20f, 5.64f, 4.10f, 3.98f };

        id = Short.parseShort(JOptionPane.showInputDialog(null, "Enter Student's ID."));
        for (int i = 0; i < idNumber.length; i++) {
            if (id == idNumber[i]) {
                JOptionPane.showMessageDialog(null, "Name: " + names[i] + "\nAverage Grade: " + avgGrade[i]);
                foundId = true;
            }
        }

        if (!foundId)
            JOptionPane.showMessageDialog(null, "ID not found.");
    }
}