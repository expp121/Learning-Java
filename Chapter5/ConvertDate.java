import java.util.Scanner;

public class ConvertDate {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        String date;
        String[] splitData;
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        byte[] daysInMonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        byte day, month;
        short year;
        int dayOfTheYear = 0;

        System.out.print("Enter a valid date devided by \"/\": ");
        date = input.nextLine();
        splitData = date.split("/", 0);

        month = Byte.parseByte(splitData[0]);
        day = Byte.parseByte(splitData[1]);
        year = Short.parseShort(splitData[2]);

        if (month >= 1 && month <= 12) {
            if (day <= daysInMonth[month - 1])
                System.out.println(months[month - 1] + " " + day + ", " + year);
            for (int i = 0; i < month - 1; i++) {
                dayOfTheYear += daysInMonth[i];
            }
            dayOfTheYear += day;
            System.out.println("Which is the " + dayOfTheYear + " day of the year.");
        } else
            System.out.println("Invalid Date.");
        input.close();
    }
}