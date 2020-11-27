public class LeapYear2 extends Year2{

    public LeapYear2(){
        super();
        super.daysInYear = 366;
    }

    @Override
    public int daysElapsed(int month, int day){
        int daysPassed = 0;
        for (int i = 0; i < month-1; i++) {
            daysPassed += Months.values()[i].getMonth();
        }
        daysPassed += day +1;
        return daysPassed;
    }
}