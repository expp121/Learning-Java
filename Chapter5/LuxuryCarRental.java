import java.util.Scanner;

public class LuxuryCarRental extends CarRental {
    public static Scanner input = new Scanner(System.in);
    private String choice;
    public LuxuryCarRental(String renterName,String zipCode,String carSize,short rentalDays){
        super(renterName, zipCode, carSize, rentalDays);
        setRentalDailyFee(79.99f);
        System.out.print("Do you want a chauffeur for a 200$ more a day?\n:");
        choice = input.nextLine();

        if (choice.contains("ye")) {
            super.setRentalDailyFee(super.getRentalDailyFee()+ 200.0f);
            super.setTotalRentalFee(super.getRentalDailyFee() * rentalDays);
        }
        
    }

    @Override
    public void diplay(){
        super.diplay();
        System.out.println("Chauffeur: " + this.choice);
    }
}