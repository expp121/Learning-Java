package Chapter11.caseProblems.ex1;

public class Event {

    public static final byte LOWER_PRICE_PER_GUEST = 32;
    public static final byte HIGHER_PRICE_PER_GUEST = 35;
    public static final byte PRICE_CUT_OFF = 50;
    public static final String[] eventTypes = {"wedding", "baptism", "birthday", "corporate", "other"};
    private String eventNumber;
    private String phoneNumber;
    private short numberOfGuests;
    private int price;
    private int pricePerGuest;
    private int eventType;

    public Event() {
        setEventNumber("A000");
        setNumberOfGuests((short) 0);
        this.phoneNumber = "0000000000";
    }

    public Event(String eventNumber, short numberOfGuests) {
        setEventNumber(eventNumber);
        setNumberOfGuests(numberOfGuests);
        this.phoneNumber = "0000000000";
    }

    public Event(String eventNumber, short numberOfGuests, String phoneNumber) {
        setEventNumber(eventNumber);
        setNumberOfGuests(numberOfGuests);
        setPhoneNumber(phoneNumber);
    }

    public Event(String eventNumber, short numberOfGuests, String phoneNumber, int eventType) {
        setEventNumber(eventNumber);
        setNumberOfGuests(numberOfGuests);
        setPhoneNumber(phoneNumber);
        setEventType(eventType);
    }

    public String getEventNumber() {
        return eventNumber;
    }

    public String getPhoneNumber() {

        return ("(" + this.phoneNumber.substring(0, 3) + ") " + this.phoneNumber.substring(3, 6) + "-"
                + this.phoneNumber.substring(6));
    }

    public String getEventType() {
        return eventTypes[eventType];
    }

    public int getPrice() {
        return price;
    }

    public short getNumberOfGuests() {
        return numberOfGuests;
    }

    public float getPricePerGuest() {
        return pricePerGuest;
    }

    public void setNumberOfGuests(short numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
        if (isLargeEvent())
            pricePerGuest = LOWER_PRICE_PER_GUEST;
        else
            pricePerGuest = HIGHER_PRICE_PER_GUEST;

        price = numberOfGuests * pricePerGuest;
    }

    public void setEventNumber(String eventNumber) {
        if (eventNumber.length() == 4
                && (Character.isLetter(eventNumber.charAt(0)) && eventNumber.substring(1).matches("[0-9]{3}"))) {
            this.eventNumber = eventNumber.toUpperCase();
        } else
            this.eventNumber = "A000";
    }

    public void setPhoneNumber(String phoneNumber) {

        StringBuilder temp = new StringBuilder(phoneNumber);
        temp.replace(0, temp.length(), temp.toString().replaceAll("[^0-9]", ""));
        if (temp.length() == 10) {
            this.phoneNumber = temp.toString();
        } else
            this.phoneNumber = "0000000000";
    }

    public boolean isLargeEvent() {
        return getNumberOfGuests() >= 50;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType > eventTypes.length ? 4 : eventType;
    }

}