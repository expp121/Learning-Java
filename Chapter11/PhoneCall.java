abstract public class PhoneCall {
    
    protected String phoneNumber;
    protected double callPrice;

    public PhoneCall(String phoneNumber){
        this.phoneNumber = phoneNumber;
        this.callPrice = 0.0;
    }

    public void setPrice(double price){
        this.callPrice = price;
    }

    public abstract double getCallPrice();

    public abstract String getPhoneNumber();

    public abstract void displayInformation();
}
