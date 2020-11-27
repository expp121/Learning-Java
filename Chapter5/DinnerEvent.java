public class DinnerEvent extends Event{
    private final String[] entrees = {"crockets", "patatoes filled with bacon and cheese", "crab meat rools", "snails with pasta"};
    private final String[] sideDishesh = {"mushrooms", "sturgeon", "bean soup", "fried eggs with bacon", "ramen", "baked rice"};
    private final String[] desserts = {"Oreo Truffles", "Chocolate Pudding" , "Confetti Squares", "Chess Pie"};    
    private int entree;
    private int sideDish1;
    private int sideDish2;
    private int desert;


    public DinnerEvent(String eventNumber, short numberOfGuests, int entree, int sideDish1, int sideDish2, int desert){
        super(eventNumber, numberOfGuests);
        if (entree>=0 && entree <  this.entrees.length)
            this.entree = entree;
        else this.entree = 0;

        if (sideDish1 >=0 && sideDish1 < this.sideDishesh.length)
            this.sideDish1 = sideDish1;
        else this.sideDish1 = 0;

        if (sideDish2 >=0 && sideDish2 < this.sideDishesh.length)
            this.sideDish2 = sideDish2;
        else this.sideDish2 = 0;

        if (desert >= 0 && desert < this.desserts.length)
            this.desert = desert;
        else this.desert = 0;

    }

    public String getMenu(){
        return ("Entree: " + this.entrees[this.entree - 1] 
        + "\nSide dish 1: " + this.sideDishesh[this.sideDish1 - 1]
        + "\nSide dish 2: " + this.sideDishesh[this.sideDish2 - 1] 
        + "\nDessert: " + this.desserts[this.desert - 1]);
    }
}
