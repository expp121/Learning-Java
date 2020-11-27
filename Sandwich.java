/**
 * Sandwich
 */
public class Sandwich {

    String ingredient;
    String breadType;
    float price;

    public void setIngredient(String ingredient){this.ingredient=ingredient;}
    public void setBreadType(String breadType){this.breadType=breadType;}
    public void setPrice(float price){this.price=price;}
    
    public String getIngredient(){return ingredient;}
    public String getBreadType(){return breadType;}
    public float getPrice(){return price;}
}