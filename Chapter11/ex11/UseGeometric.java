package ex11;

import figures.GeometricFigure;
import figures.Square;
import figures.Triangle;

public class UseGeometric {

    public static void main(String[] args) {
        GeometricFigure[] figures = new GeometricFigure[6];

        for (int i = 0; i < figures.length - 1; i += 2) {
            figures[i] = new Triangle(i + 1, i + 1);
            figures[i + 1] = new Square(i + 2);
        }

        for (int i = 0; i < figures.length; i++)
            display(figures[i]);
    }

    public static void display(GeometricFigure figure) {
        System.out.println("\nWidth: " + figure.getWidth() + "\nHeight: " + figure.getHeight() + "\nType: "
                + figure.getFigureType() + "\nArea: " + figure.getArea());
                figure.displaySides();
    }
}
