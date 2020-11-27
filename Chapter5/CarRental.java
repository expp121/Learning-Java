public class CarRental {
    enum CarSize{
        ECONOMY(29.99F),MIDSIZE(38.99F),FULLSIZE(43.50F);

        float carSize;

        CarSize(float carSize){
            this.carSize = carSize;
        }

        public float getCarSize(){
            return this.carSize;
        }
    }
    
    private String renterName;
    private String zipCode;
    private String carSize;
    private float dailyRentalFee;
    private short rentalDays;
    private float totalRentalFee;

    public CarRental(String renterName, String zipCode, String carSize, short rentalDays){
        this.renterName = renterName;
        this.zipCode = zipCode;
        this.rentalDays = rentalDays;
        for (int i = 0; i < CarSize.values().length; i++) {
            if (carSize.toLowerCase().equals(CarSize.values()[i].toString().toLowerCase())) {
                this.carSize = carSize;
                this.dailyRentalFee = CarSize.values()[i].getCarSize();
                this.totalRentalFee = this.dailyRentalFee * this.rentalDays;
                break;
            } 
        }
    }

    protected void setRentalDailyFee(float rentalFee){
        this.dailyRentalFee = rentalFee;
    }

    protected float getRentalDailyFee(){
        return this.dailyRentalFee;
    }

    protected void setTotalRentalFee(float totalRentalFee){
        this.totalRentalFee = totalRentalFee;
    }

    public void diplay(){
        System.out.println("\n\nRenter Name: " + this.renterName 
        + "\nZip Code: " + this.zipCode + "\nCar Size: " + this.carSize
        + "\nDaily Rental Fee: " + this.dailyRentalFee 
        + "$\nRental Days: " + this.rentalDays + "\nTotal Rental Fee: " + this.totalRentalFee + '$');
    }
    
}