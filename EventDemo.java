/**
 * EventDemo
 */
public class EventDemo {

    public static void main(String[] args) {
        Event event = new Event();
        CarlysEventPriceWithMethods.displayCompanyMotto();
        event.setNumberOfGuests(CarlysEventPriceWithMethods.getNumberOfGuests());
        event.setEventNumber(CarlysEventPriceWithMethods.getEventNumber());
        displayEvent(event);
    }
    public static void displayEvent(Event event) {
        System.out.print("\nEvent Number: " + event.getEventNumber());
        System.out.print("\nNumber of guests: " + event.getNumberOfGuests() + "\n");
        CarlysEventPriceWithMethods.computePrice(event.getNumberOfGuests());
    }
}