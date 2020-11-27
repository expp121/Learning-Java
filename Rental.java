/**
 * Rental
 */
public class Rental {
    public final static byte NUMBER_OF_MINUTES_IN_HOUR = 60;
    public final static byte HOURLY_RENTAL = 40;

    private String contractNumber;
    private short rentalHours;
    private short rentalMinutes;
    private short price;

    public void setHoursAndMinutes(short minutes){
    this.rentalHours = (short)(minutes / NUMBER_OF_MINUTES_IN_HOUR);
    this.rentalMinutes = (short)(minutes - (this.rentalHours * NUMBER_OF_MINUTES_IN_HOUR));
    this.price = (short)(this.rentalHours * HOURLY_RENTAL + this.rentalMinutes);
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public short getRentalHours() {
        return rentalHours;
    }

    public void setRentalHours(short rentalHours) {
        this.rentalHours = rentalHours;
    }

    public short getRentalMinutes() {
        return rentalMinutes;
    }

    public void setRentalMinutes(short rentalMinutes) {
        this.rentalMinutes = rentalMinutes;
    }

    public short getPrice() {
        return price;
    }

    public void setPrice(short price) {
        this.price = price;
    }
    
}