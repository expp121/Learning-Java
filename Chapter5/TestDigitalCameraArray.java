
/**
 * TestDigitalCamera
 */
import java.util.Scanner;

public class TestDigitalCameraArray {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        DigitalCamera[] cameras = new DigitalCamera[4];

        for (int i = 0; i < cameras.length; i++)
            cameras[i] = init();

        for (int i = 0; i < cameras.length; i++)
            cameras[i].digitalCameraDetails();

        input.close();
    }

    public static DigitalCamera init() {
        String brand;
        byte mp;
        System.out.print("Whats the camera's brand: ");
        brand = input.nextLine();
        System.out.print("What's the number of Megapixels in the camera's sensor:");
        mp = input.nextByte();
        input.nextLine();
        DigitalCamera camera = new DigitalCamera(brand, mp);
        return camera;
    }
}