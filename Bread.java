
public class Bread {

    public static final String MOTTO = "The staff of life";

    private String type;
    private short caloriesPerSlice;

    public Bread(String type, short calories) {
        this.type = type;
        this.caloriesPerSlice = calories;
    }
    
    public Bread() {
        this("White Bread",(short)(30));
    }

    public short getCaloriesPerSlice() {
        return caloriesPerSlice;
    }
    
    public String getType() {
        return type;
    }
    
}