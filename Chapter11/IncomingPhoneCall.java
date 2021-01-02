public class IncomingPhoneCall extends PhoneCall {

    public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        super.callPrice = 0.02;
    }

    @Override
    public double getCallPrice() {
        return super.callPrice;
    }

    @Override
    public String getPhoneNumber() {
        return super.phoneNumber;
    }

    @Override
    public void displayInformation() {
        System.out.println("Phone number: " + getPhoneNumber() + "\nRate: " + getCallPrice() + "\nPrice of call: $"
                + getCallPrice());

    }

}
