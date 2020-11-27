public class UseYear2 {
    public static void main(String[] args) {
        Year2 year = new Year2();
        LeapYear2 LeapYear = new LeapYear2();

        System.out.println(year.getDaysInYear());
        System.out.println(LeapYear.getDaysInYear());
        System.out.println(year.daysElapsed(1, 24));
        System.out.println(LeapYear.daysElapsed(1, 24));
    }
}