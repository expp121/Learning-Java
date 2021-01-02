package ex8;

public class Lamp implements Turner {

    @Override
    public void turn() {
        System.out.println("Turning on the lamp...");
    }
}
