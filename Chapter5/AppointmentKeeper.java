import java.util.Scanner;

public class AppointmentKeeper {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] matrix = new String[2][24];
        StringBuilder appointmentDescription = new StringBuilder();
        byte day;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < (matrix[i].length / 2); j++)
                matrix[i][j] = (j + 1) + " a.m. >> ";

            for (int j = 0; j < matrix[i].length / 2; j++)
                matrix[i][j + 12] = (j + 1) + "p.m. >> ";
        }

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Please enter a Description for the appointment on " + (i + 1) + " day, on "
                        + matrix[i][j].substring(0, matrix[i][j].length() - 4) + "\n:");

                appointmentDescription.delete(0, appointmentDescription.length());
                appointmentDescription.append(input.nextLine());

                if (appointmentDescription.length() == 0)
                    matrix[i][j] += "Nothing scheduled";
                else
                    matrix[i][j] += appointmentDescription.toString();

            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }

        while (true) {
            System.out.print("Enter a day to see what's scheduled, or 99 to quit:");
            day = input.nextByte();
            if (day != 99 && day <= matrix.length)
                for (int i = 0; i < matrix[day - 1].length; i++)
                    System.out.println(matrix[day - 1][i]);
            else
                break;

        }

    }

}