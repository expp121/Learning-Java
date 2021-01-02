public class OutgoingPhoneCall extends PhoneCall {

    private int minutes;

    public OutgoingPhoneCall(String phoneNumber, int minutesSpoken) {
        super(phoneNumber);
        super.callPrice = 0.04;
        this.minutes = minutesSpoken;
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
        System.out.println("Phone number: " + getPhoneNumber() + "\nPrice per minute: " + getCallPrice()
                + "\nNumber of minutes: " + this.minutes + "\nCall Price: $" + (getCallPrice() * this.minutes));
    }

}
