
/**
 * EventDemo
 */
public class EventDemo2 {

    public static void main(String[] args) {
        Event[] events = new Event[3];
        for (int i = 0; i < events.length; i++)
            events[i] = new Event(CarlysEventPriceWithMethods.getEventNumber(),
                    CarlysEventPriceWithMethods.getNumberOfGuests(), CarlysEventPriceWithMethods.getPhoneNumber());
        CarlysEventPriceWithMethods.displayCompanyMotto();

        for (int i = 0; i < events.length; i++)
            displayEvent(events[i]);
    }

    public static void displayEvent(Event event) {
        System.out.print("\nEvent Number: " + event.getEventNumber());
        System.out.print("\nNumber of guests: " + event.getNumberOfGuests() + "\n");
        System.out.print("\nPhone number: " + event.getPhoneNumber() + "\n");
        CarlysEventPriceWithMethods.computePrice(event.getNumberOfGuests());
    }
}