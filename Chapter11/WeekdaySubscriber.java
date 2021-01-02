public class WeekdaySubscriber extends NewspaperSubscriber {

    @Override
    public void setSubscriptionRate() {
        super.subscriptionRate = 3.50;
    }

    public String toString() {
        return "Service Type: Weekday Subscriber" + "\nSubscriber's Street Address: " + super.getSubscriberStreet()
                + "\nSubscription rate: " + super.getSubscriptionRate();
    }
}
