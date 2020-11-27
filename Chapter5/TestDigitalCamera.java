/**
 * TestDigitalCamera
 */
import java.util.Scanner;

public class TestDigitalCamera {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        DigitalCamera camera1, 
                      camera2, 
                      camera3, 
                      camera4;
    
        camera1 = init();
        camera2 = init();
        camera3 = init();
        camera4 = init();

        camera1.digitalCameraDetails();
        camera2.digitalCameraDetails();
        camera3.digitalCameraDetails();
        camera4.digitalCameraDetails();
    }

    public static DigitalCamera init() {
        String brand;
        byte mp;
        System.out.print("Whats the camera's brand: ");
        brand = input.nextLine();
        System.out.print("What's the number of Megapixels in the camera's sensor:" );
        mp = input.nextByte();
        input.nextLine();
        DigitalCamera camera = new DigitalCamera(brand, mp);
        return camera;
    }
}