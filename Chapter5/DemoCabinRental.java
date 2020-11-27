public class DemoCabinRental {
    public static void main(String[] args) {
        CabinRental cabin = new CabinRental(1);
        HolidayCabinRental holidayCabin = new HolidayCabinRental(5,23);
        display(cabin);
        display(holidayCabin);
    }

    public static void display(CabinRental cabin) {
        System.out.println("\n\nCabin Number: " + cabin.getCabinNumber() + 
        "\nRent: " + cabin.getCabinRent());
    }

    public static void display(HolidayCabinRental cabin){
        System.out.println("\n\nCabin Number: " + cabin.getCabinNumber() + 
        "\nRent: " + cabin.getCabinRent() + "\nRoom Number: " + cabin.getRoomNumber());
    }
}