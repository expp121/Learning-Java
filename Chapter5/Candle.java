public class Candle {
    private String color;
    private float height;
    protected float price;

    public String getColor() {
        return this.color;
    }

    public float getHeight(){
        return this.height;
    }

    public float getPrice() {
        return this.price;
    }

    public void setColor(String color){
        this.color = color;

    }

    public void setHeight(float height)
    {
        this.height = height;
        this.price = height * 2;
    }
}