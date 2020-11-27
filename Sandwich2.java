/**
 * Sandwich2
 */
public class Sandwich2 {
    private Bread bread;
    private SandwichFilling filling;

    public Sandwich2() {
        bread = new Bread();
        filling = new SandwichFilling();
    }
    
    public Sandwich2(String typeOfBread, short caloriesPerSlice, String typeOfFill, short caloriesInfilling) {
        bread = new Bread(typeOfBread, caloriesPerSlice);
        filling = new SandwichFilling(typeOfFill, caloriesInfilling);
    }

    public Sandwich2(String typeOfBread, short caloriesPerSlice) {
        bread = new Bread(typeOfBread,caloriesPerSlice);
        filling = new SandwichFilling();
    }

    public Sandwich2(short caloriesInfilling,String typeOfFill) {
        bread = new Bread();
        filling = new SandwichFilling(typeOfFill,caloriesInfilling);
    }

    public Bread getBread() {
        return bread;
    }

    public SandwichFilling getFilling() {
        return filling;
    }
}