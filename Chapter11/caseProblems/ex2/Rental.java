package Chapter11.caseProblems.ex2;

import java.util.Scanner;

/**
 * Rental
 */
public class Rental {
    public static final Scanner input = new Scanner(System.in);
    public final static byte NUMBER_OF_MINUTES_IN_HOUR = 60;
    public final static byte HOURLY_RENTAL = 40;
    private String contractNumber;
    private short rentalHours;
    private short rentalMinutes;
    private short price;
    private Equipment equip;
    private short basePrice;


    public Rental(String contractNumber, short minutes) {
        setHoursAndMinutes(minutes);
        setContractNumber(contractNumber);
        equip = null;
    }

    public Rental(String contractNumber, short minutes, int equipmentType) {
        setHoursAndMinutes(minutes);
        setContractNumber(contractNumber);
        System.out.println("Do you want to have a lesson?");
        if (input.nextLine().contains("y"))
            equip = new EquipmentWithLesson(equipmentType);
        else equip = new EquipmentWithoutLesson(equipmentType);
    }

    public Rental() {
        this("A000", (short) 0);
        equip = null;
    }

    public void setHoursAndMinutes(short minutes) {
        this.rentalHours = (short) (minutes / NUMBER_OF_MINUTES_IN_HOUR);
        this.rentalMinutes = (short) (minutes - (this.rentalHours * NUMBER_OF_MINUTES_IN_HOUR));
        this.basePrice = (short) (this.rentalHours * HOURLY_RENTAL);
        this.price = (short) (this.rentalHours * HOURLY_RENTAL + (this.rentalMinutes <= 40 ? this.rentalMinutes : 0));
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
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

    public short getRentalMinutes() {
        return rentalMinutes;
    }

    public short getPrice() {
        return price;
    }

    public short getBasePrice() { return basePrice;}

    public short getRentalHours() {
        return rentalHours;
    }

}