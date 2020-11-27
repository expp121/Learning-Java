public class CabinRental {
    private int cabinNumber;
    private double cabinRent;

    public CabinRental(int cabinNumber){
        if (cabinNumber>0 && cabinNumber<4) {
            
            this.cabinRent = 950.0;
        }
        else this.cabinRent = 1100.0;
        this.cabinNumber = cabinNumber;
    }
    public int getCabinNumber(){
        return this.cabinNumber;
    }

    public double getCabinRent(){
        return this.cabinRent;
    }

    protected void setCabinRent(double cabinRent){
        this.cabinRent = cabinRent;
    }

}