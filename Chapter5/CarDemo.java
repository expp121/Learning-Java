public class CarDemo {

    public static void main(String Args[]) {
        Car car = new Car(1980, Model.SEDAN, Color.WHITE);
        Car car2 = new Car(1944, Model.CONVERTIBLE, Color.BLACK);

        car.display();
        car2.display();
    }
}