import java.util.Scanner;

public class Subscribers {

    public static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {

        NewspaperSubscriber subscriber = null;

        System.out.println("Enter the subscriber's street:");
        String subscriberStreet = input.nextLine();

        System.out.println(
                "Enter a service type \n1.Seven Day Subscriber\n2.Weekday Subscriber\n3.Weekend Subscriber:");
        byte serviceType = input.nextByte();

        switch (serviceType) {
            case 1:
                subscriber = new SevenDaySubscriber();
                break;

            case 2:
                subscriber = new WeekdaySubscriber();
                break;

            case 3:
                subscriber = new WeekendSubscriber();
                break;

            default:
            System.out.println("Invalid Service Type!");
                break;
        }

        if (subscriber != null) {
            subscriber.setSubscriberStreet(subscriberStreet);
            subscriber.setSubscriptionRate();
            System.out.println(subscriber.toString());
        }

    }
}