public class UseCarRental {
    public static void main(String[] args) {
        CarRental car = new CarRental("Diko", "1913", "midsize", (short)5);
        LuxuryCarRental luxuryCar = new LuxuryCarRental("Ajo", "6412", "fullsize", (short)12);
        car.diplay();
        luxuryCar.diplay();
    }
}