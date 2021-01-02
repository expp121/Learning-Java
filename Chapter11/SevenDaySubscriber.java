public class SevenDaySubscriber extends NewspaperSubscriber {

    @Override
    public void setSubscriptionRate() {
        super.subscriptionRate = 4.5;
    }

    public String toString() {
        return "Service Type: Seven Day Subscriber" + "\nSubscriber's Street Address: " + super.getSubscriberStreet()
                + "\nSubscription rate: " + super.getSubscriptionRate();
    }
}
