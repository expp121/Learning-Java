public class ScentedCandle extends Candle {
    private String scent;


    public void setScent(String scent){
        this.scent = scent;
    }

    public String getScent(){
        return this.scent;
    }

    @Override
    public void setHeight(float height){
        super.setHeight(height);
        this.price = height * 3;
    }
}