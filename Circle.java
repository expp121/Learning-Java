/**
 * Circle
 */

public class Circle {

    float radius;
    float diameter;
    float area;

    public Circle() {
        this.radius = 1;
        this.diameter = radius * 2;
        this.area = (float)Math.PI * (float)Math.pow(radius, 2);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
        this.diameter = radius * 2;
        this.area = (float)Math.PI * (float)Math.pow(radius, 2);
    }

    public float getDiameter() {
        return diameter;
    }

    public float getArea() {
        return area;
    }
}