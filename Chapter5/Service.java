public class Service {
    private String serviceName; // { "Cut", "Shampoo", "Manicure", "Style", "Permanent", "Trim" };
    private float servicePrice;// { 8.00f, 4.00f, 18.00f, 48.00f, 18.00f, 6.00f };
    private short serviceTime;// { 15, 10, 30, 55, 35, 5 };

    public Service(String serviceName, float servicePrice, short serviceTime) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
        this.serviceTime = serviceTime;
    }

    public String getServiceName() {
        return serviceName;
    }

    public float getServicePrice() {
        return servicePrice;
    }

    public short getServiceTime() {
        return serviceTime;
    }

}