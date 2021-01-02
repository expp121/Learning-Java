public class Lamborghini extends Auto {

    public Lamborghini(){
        this.setCarBrand("Lamborghini");
    }   

    @Override
    public void setCarPrice() {
        super.carPrice = 120000.99f;
    }
    
}
