/**
 * Event
 */
public class Event {

    public static final byte PRICE_PER_GUEST = 35;
    public final static byte PRICE_CUT_OFF = 50;
    private String eventNumber;
    private short numberOfGuests;
    private int price;

	public String getEventNumber() {
		return eventNumber;
	}
	public void setEventNumber(String eventNumber) {
		this.eventNumber = eventNumber;
	}
	public short getNumberOfGuests() {
		return numberOfGuests;
	}
	public void setNumberOfGuests(short numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
        price = numberOfGuests * PRICE_PER_GUEST;
    }
    public int getPrice() {
        return price;
    }

}