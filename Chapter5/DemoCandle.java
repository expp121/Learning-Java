public class DemoCandle {
    
    public static void main(String[] args) {
        Candle candle = new Candle();
        ScentedCandle scentedCandle = new ScentedCandle();
        candle.setColor("black");
        candle.setHeight(5);
        scentedCandle.setColor("red");
        scentedCandle.setHeight(5);
        scentedCandle.setScent("Vanilla");

        System.out.println("Normal Candle\nColor: " + candle.getColor() 
        + "\nHeight: " + candle.getHeight() + "\nPrice: " + candle.getPrice()
        + "\n\nScented Candle\nColor: " + scentedCandle.getColor() + "\nHeight: " 
        + scentedCandle.getHeight() + "\nScent: " + scentedCandle.getScent() 
        + "\nPrice: " + scentedCandle.getPrice());
    }
}