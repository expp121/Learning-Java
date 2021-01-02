public class Honda extends Auto {
    public Honda() {
        super.setCarBrand("Honda");
    }

    @Override
    public void setCarPrice() {
        super.carPrice = 50000.99f;
    }

}
