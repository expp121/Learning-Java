
/**
 * EventDemo
 */
public class EventDemo {

    public static void main(String[] args) {
        Event event = new Event();
        Event event2 = new Event(CarlysEventPriceWithMethods.getEventNumber(),
                CarlysEventPriceWithMethods.getNumberOfGuests(), CarlysEventPriceWithMethods.getPhoneNumber());
        CarlysEventPriceWithMethods.displayCompanyMotto();
        displayEvent(event);
        displayEvent(event2);

        System.out.println("\n\n");
        for (int i = 0; i < event2.getNumberOfGuests(); i++) {
            System.out.println("Please come to my event, guest number " + (i + 1));
        }
    }

    public static void displayEvent(Event event) {
        System.out.print("\nEvent Number: " + event.getEventNumber());
        System.out.print("\nNumber of guests: " + event.getNumberOfGuests() + "\n");
        System.out.print("\nPhone number: " + event.getPhoneNumber() + "\n");
        CarlysEventPriceWithMethods.computePrice(event.getNumberOfGuests());
    }
}