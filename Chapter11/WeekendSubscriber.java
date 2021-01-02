public class WeekendSubscriber extends NewspaperSubscriber {

    @Override
    public void setSubscriptionRate() {
        super.subscriptionRate = 2.0;
    }

    public String toString() {
        return "Service Type: Weekend Subscriber" + "\nSubscriber's Street Address: " + super.getSubscriberStreet()
                + "\nSubscription rate: " + super.getSubscriptionRate();
    }
}
