package ex9;

public abstract class Insurance {
    private String typeOfInsurance;
    protected double mountlyPrice;

    public Insurance(String typeOfInsurance) {
        this.typeOfInsurance = typeOfInsurance;
    }

    public abstract void setCost();

    public String getTypeOfInsurance() {
        return this.typeOfInsurance;
    }

    public double getMountlyPrice() {
        return this.mountlyPrice;
    }

    public abstract void display();
}
