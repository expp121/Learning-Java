public class HolidayCabinRental extends CabinRental {

    private int roomNumber;

    public HolidayCabinRental(int cabinNumber,int roomNumber){
        super(cabinNumber);
        this.roomNumber = roomNumber;
        super.setCabinRent(super.getCabinRent()+150.0);
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }
}