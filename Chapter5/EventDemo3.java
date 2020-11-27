import java.util.Scanner;

/**
 * EventDemo
 */
public class EventDemo3 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        String sortChoice;
        byte dishChoice;
        DinnerEvent[] events = new DinnerEvent[4];

        for (int i = 0; i < events.length; i++){
            dishChoice =(byte) (Math.random() *3);
            events[i] = new DinnerEvent(CarlysEventPriceWithMethods.getEventNumber(),
                    CarlysEventPriceWithMethods.getNumberOfGuests(),dishChoice,dishChoice,dishChoice,dishChoice);
        }
        CarlysEventPriceWithMethods.displayCompanyMotto();

        System.out.print("How do you want to sort the events\n1.Event Number\n2.Number of Guests\n3.Event type\n: ");
        sortChoice = input.nextLine();

        DinnerEvent temp;
        if (sortChoice.equals("1") || sortChoice.toLowerCase().contains("event n")) {

            for (int i = 0; i < events.length - i; i++)
                for (int j = 0; j < events.length - i; j++)
                    if (events[j].getEventNumber().compareTo(events[j + 1].getEventNumber()) > 0) {
                        temp = events[j];
                        events[j] = events[j + 1];
                        events[j + 1] = temp;
                    }
        }
        if (sortChoice.equals("2") || sortChoice.toLowerCase().contains("number")) {

            for (int i = 0; i < events.length - i; i++)
                for (int j = 0; j < events.length - i; j++)
                    if (events[j].getNumberOfGuests() > events[j + 1].getNumberOfGuests()) {
                        temp = events[j];
                        events[j] = events[j + 1];
                        events[j + 1] = temp;
                    }
        }

        if (sortChoice.equals("3") || sortChoice.toLowerCase().contains("event t")) {

            for (int i = 0; i < events.length - 1; i++) {
                if (events[i].getEventType().compareTo(events[i + 1].getEventType()) > 0) {
                    temp = events[i];
                    events[i] = events[i + 1];
                    events[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < events.length; i++)
            displayEvent(events[i]);
    }

    public static void displayEvent(DinnerEvent event) {
        System.out.print("\n\nEvent Number: " + event.getEventNumber()
        +"\nNumber of guests: " + event.getNumberOfGuests()
        +"\nPhone number: " + event.getPhoneNumber()
        +"\nEvent Type: " + event.getEventType() + "\n");
        CarlysEventPriceWithMethods.computePrice(event.getNumberOfGuests());
    }
}