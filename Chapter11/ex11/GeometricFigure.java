package figures;

public abstract class GeometricFigure implements SidedObject {
    private float width;
    private float height;
    protected float area;
    private String figureType;

    public abstract void setArea();

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    public float getWidth() {
        return this.width;
    }

    public float getHeight() {
        return this.height;
    }

    public String getFigureType() {
        return this.figureType;
    }

    public float getArea() {
        return this.area;
    }

}
