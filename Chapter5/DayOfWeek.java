import java.util.Scanner;

public class DayOfWeek {

    public static Scanner input = new Scanner(System.in);

    enum DayInWeek {
        MONDAY("9 to 9"), TUESDAY("9 to 9"), WEDNESDAY("9 to 9"), THURSDAY("9 to 9"), FRIDAY("9 to 9"),
        SATURDAY("10 to 6"), SUNDAY("11 to 5");

        private String day;

        public String getDay() {
            return this.day;
        }

        private DayInWeek(String day) {
            this.day = day;
        }

    }

    public static void main(String[] args) {

        String day;
        for (int i = 0; i < DayInWeek.values().length; i++) {
            System.out.println(DayInWeek.values()[i]);
        }
        System.out.print("Choose a day: ");
        day = input.nextLine();
        System.out.println("The working hours for " + DayInWeek.valueOf(day) + " is "
                + DayInWeek.values()[DayInWeek.valueOf(day).ordinal()].getDay());

    }
}