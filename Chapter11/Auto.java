public abstract class Auto {
    private String carBrand;
    protected float carPrice;

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public abstract void setCarPrice();

    public String getCarBrand() {
        return carBrand;
    }

    public float getCarPrice() {
        return carPrice;
    }

    public String displayInformation(){
        return "Brand: " + this.carBrand + "\nCar price: " + this.carPrice + "\n";
    }


}
