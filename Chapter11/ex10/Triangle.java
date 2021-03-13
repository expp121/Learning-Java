package figures;

public class Triangle extends GeometricFigure {

    public Triangle(float width, float height) {
        super.setWidth(width);
        super.setHeight(height);
        super.setFigureType("triangle");
        this.setArea();
    }

    @Override
    public void setArea() {
        super.area = super.getHeight() * super.getWidth() * 0.5f;

    }

}
