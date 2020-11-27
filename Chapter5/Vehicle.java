
public class Vehicle {
    private byte numberOfWheels;
    private float avgMilesPerGalon;

    public Vehicle(byte numberOfWheels, float avgMilesPerGalon){
        this.numberOfWheels = numberOfWheels;
        this.avgMilesPerGalon = avgMilesPerGalon;
    }

    public Vehicle(int numberOfWheels, double avgMilesPerGalon){
        this.numberOfWheels = (byte)numberOfWheels;
        this.avgMilesPerGalon = (float)avgMilesPerGalon;
    }

    public String toString(){
        return "NumOfWheels:" + this.numberOfWheels + 
        "\nAvgMilesPerGalon:" + this.avgMilesPerGalon;
    }
}