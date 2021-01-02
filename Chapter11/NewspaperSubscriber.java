public abstract class NewspaperSubscriber {
    private String subscriberStreet;
    protected double subscriptionRate;

    public void setSubscriberStreet(String subscriberStreet) {
        this.subscriberStreet = subscriberStreet;
    }

    public abstract void setSubscriptionRate();

    public String getSubscriberStreet() {
        return subscriberStreet;
    }

    public double getSubscriptionRate() {
        return subscriptionRate;
    }

    public boolean equals(NewspaperSubscriber subscriber) {
        return this.subscriberStreet.equals(subscriber.getSubscriberStreet());
    }
}
