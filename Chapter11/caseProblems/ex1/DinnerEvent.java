package Chapter11.caseProblems.ex1;

public class DinnerEvent extends Event {
    private final String[] entrees = {"crockets", "potatoes filled with bacon and cheese", "crab meat rolls", "snails with pasta"};
    private final String[] sideDishes = {"mushrooms", "sturgeon", "bean soup", "fried eggs with bacon", "ramen", "baked rice"};
    private final String[] desserts = {"Oreo Truffles", "Chocolate Pudding", "Confetti Squares", "Chess Pie"};
    private int entree;
    private int sideDish1;
    private int sideDish2;
    private int desert;
    private Employee[] employees = new Employee[15];

    public DinnerEvent(String eventNumber, short numberOfGuests, int entree, int sideDish1, int sideDish2, int desert, String phoneNumber, Employee[] employees) {
        super(eventNumber, numberOfGuests, phoneNumber);
        if (entree >= 0 && entree < this.entrees.length)
            this.entree = entree;
        else this.entree = 0;

        if (sideDish1 >= 0 && sideDish1 < this.sideDishes.length)
            this.sideDish1 = sideDish1;
        else this.sideDish1 = 0;

        if (sideDish2 >= 0 && sideDish2 < this.sideDishes.length)
            this.sideDish2 = sideDish2;
        else this.sideDish2 = 0;

        if (desert >= 0 && desert < this.desserts.length)
            this.desert = desert;
        else this.desert = 0;
        this.employees = employees;
    }

    public String getMenu() {
        return ("Entree: " + this.entrees[this.entree - 1]
                + "\nSide dish 1: " + this.sideDishes[this.sideDish1 - 1]
                + "\nSide dish 2: " + this.sideDishes[this.sideDish2 - 1]
                + "\nDessert: " + this.desserts[this.desert - 1]);
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

}
