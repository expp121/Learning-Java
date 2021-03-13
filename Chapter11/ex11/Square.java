package figures;

public class Square extends GeometricFigure {

    public Square(float x){
        super.setWidth(x);
        super.setHeight(x);
        super.setFigureType("square");
        this.setArea();
    }

    @Override
    public void setArea() {
        super.area = super.getHeight() * super.getHeight();
    }

    @Override
    public void displaySides() {
        System.out.println("Number of sides: 4");
    }
    
}
