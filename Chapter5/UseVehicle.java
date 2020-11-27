

public class UseVehicle {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle(3,4.2);
        Car2 car = new Car2(7.5);
        MotorCycle motorCycle = new MotorCycle(3.1);

        System.out.println(vehicle.toString());
        System.out.println(car.toString());
        System.out.println(motorCycle.toString());
    }
}