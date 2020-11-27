/**
 * Rental
 */
public class Rental {
    public final static byte NUMBER_OF_MINUTES_IN_HOUR = 60;
    public final static byte HOURLY_RENTAL = 40;
    public final static String[] equipment = { "jet ski", "pontoon boat", "rowboat", "canoe", "kayak", "beach chair",
            "umbrella", "other" };
    private String contractNumber;
    private int equipmentType;
    private short rentalHours;
    private short rentalMinutes;
    private short price;

    public Rental(String contractNumber, short minutes) {
        setHoursAndMinutes(minutes);
        setContractNumber(contractNumber);
    }

    public Rental(String contractNumber, short minutes, int equipmentType) {
        setHoursAndMinutes(minutes);
        setContractNumber(contractNumber);
        setEquipmentType(equipmentType);
    }

    public Rental() {
        this("A000", (short) 0);
    }

    public void setHoursAndMinutes(short minutes) {
        this.rentalHours = (short) (minutes / NUMBER_OF_MINUTES_IN_HOUR);
        this.rentalMinutes = (short) (minutes - (this.rentalHours * NUMBER_OF_MINUTES_IN_HOUR));
        this.price = (short) (this.rentalHours * HOURLY_RENTAL + (this.rentalMinutes <= 40 ? this.rentalMinutes : 0));
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public void setEquipmentType(int equipmentType) {
        this.equipmentType = equipmentType < Rental.equipment.length ? equipmentType : (equipment.length - 1);
    }

    public void setPrice(short price) {
        this.price = price;
    }

    public void setRentalHours(short rentalHours) {
        this.rentalHours = rentalHours;
    }

    public void setRentalMinutes(short rentalMinutes) {
        this.rentalMinutes = rentalMinutes;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public String getEquipmentType() {
        return equipment[this.equipmentType];
    }

    public short getRentalMinutes() {
        return rentalMinutes;
    }

    public short getPrice() {
        return price;
    }

    public short getRentalHours() {
        return rentalHours;
    }

}