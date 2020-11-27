/**
 * TestCircle
 */
public class TestCircle {

    public static void main(String[] args) {
        Circle circle1 = new Circle(), 
                circle2 = new Circle(), 
                circle3 = new Circle();
        circle2.setRadius(2.5f);
        circle3.setRadius(12.2f);
        displayCircle(circle1);
        displayCircle(circle2);
        displayCircle(circle3);
    }
    public static void displayCircle(Circle circle){
        System.out.println("\nCircle radius: " + circle.getRadius() + "\nCircle diameter: " + circle.getDiameter() + "\nCircle Area: " + circle.getArea());
    }
}