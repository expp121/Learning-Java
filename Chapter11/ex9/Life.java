package ex9;

public class Life extends Insurance {

    public Life() {
        super("Life Insurance");
    }

    @Override
    public void setCost() {
        super.mountlyPrice = 36.0;
    }

    @Override
    public void display() {
        System.out.println(
                "Insurance Type: " + super.getTypeOfInsurance() + "Price per month: " + super.getMountlyPrice());
    }

}
