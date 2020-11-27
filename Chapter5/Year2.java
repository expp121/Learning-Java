public class Year2 {

    enum Months{
        JAN(31),FEB(29), MAR(31), APR(30), MAY(31), JUNE(30), JULY(31), AUG(31), SEP(30), OCT(31), NOV(30), DEC(31);

        private int month;

        public int getMonth(){
            return this.month;
        }
         Months(int month){
            this.month = month;
        }
    }
    protected short daysInYear;

    public Year2(){
        this.daysInYear = 365;

    }

    public short getDaysInYear(){
        return this.daysInYear;
    }

    public int daysElapsed(int month, int day){
        int daysPassed = 0;
        for (int i = 0; i < month-1; i++) {
            daysPassed += Months.values()[i].getMonth();
        }
        daysPassed += day;
        return daysPassed;
    }
}