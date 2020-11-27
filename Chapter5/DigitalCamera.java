/**
 * DigitalCamera
 */

public class DigitalCamera {

    private String brand;
    private byte numofMP;
    private float price;

    public DigitalCamera(String brand, byte numofMP) {
        this.brand = brand;
        this.numofMP = numofMP > 10 ? 10 : numofMP;
        price = numofMP <= 6 ? 99.0f : 129.0f;
    }

    public void digitalCameraDetails() {
        System.out.println("\nCamera's Brand: " + this.brand);
        System.out.println("Camera's Megapiexels: " + this.numofMP);
        System.out.println("Camera's Price: " + this.price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public byte getNumofMP() {
        return numofMP;
    }

    public void setNumofMP(byte numofMP) {
        this.numofMP = numofMP;
    }
}