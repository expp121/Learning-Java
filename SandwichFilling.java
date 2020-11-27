/**
 * SandwichFilling
 */
public class SandwichFilling {

    private String fillingType;
    private short caloriesInServing;

    public SandwichFilling(String type, short calories) {
        this.fillingType = type;
        this.caloriesInServing = calories;
    }

    public SandwichFilling() {
        this("Lettuce, Tomatoes, Pickles",(short)(100));
    }

    public String getFillingType() {
        return fillingType;
    }

    public short getCaloriesInServing() {
        return caloriesInServing;
    }
}