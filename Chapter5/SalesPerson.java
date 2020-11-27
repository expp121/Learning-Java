public class SalesPerson {

    private int id;
    private double annualSales;

    public SalesPerson(int ID, double aS) {
        this.id = ID;
        this.annualSales = aS;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAnnualSales(double annualSales) {
        this.annualSales = annualSales;
    }

    public int getId() {
        return this.id;
    }

    public double getAnnualSales() {
        return this.annualSales;
    }

}