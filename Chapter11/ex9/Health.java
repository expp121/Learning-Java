package ex9;

public class Health extends Insurance {

    public Health() {
        super("Health Insurance");
    }

    @Override
    public void setCost() {
        super.mountlyPrice = 196.0;
    }

    @Override
    public void display() {
        System.out.println(
                "Insurance Type: " + super.getTypeOfInsurance() + "Price per month: " + super.getMountlyPrice());
    }

}
