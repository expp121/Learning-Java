/**
 * RentalDemo
 */
public class RentalDemo {

    public static void main(String[] args) {

        SammysRentalPriceWithMethods.displayCompanyMotto();

        Rental rent1 = new Rental() ,rent2 = new Rental();

        rent1.setContractNumber(SammysRentalPriceWithMethods.getContractNumber());
        rent1.setHoursAndMinutes(SammysRentalPriceWithMethods.inputRentalTime());

        SammysRentalPriceWithMethods.getDumpInput();
        
        rent2.setContractNumber(SammysRentalPriceWithMethods.getContractNumber());
        rent2.setHoursAndMinutes(SammysRentalPriceWithMethods.inputRentalTime());

        SammysRentalPriceWithMethods.computePrice(rent1);
        SammysRentalPriceWithMethods.computePrice(rent2);
    }
}