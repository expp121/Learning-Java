/**
 * Invoice
 */
public class Invoice {

    private short invoiceNumber;
    private float balanceDue;
    private short day;
    private short month;
    private short year;


    public Invoice(short invoiceNumber, float balanceDue, short day, short month, short year) {
        this.invoiceNumber = invoiceNumber < 1000 ? 0 : invoiceNumber;
        this.balanceDue = balanceDue;
        this.day = (day >= 1 && day <= 31) ? day : 0;
        this.month = (month >= 1 && month <= 12) ? month : 0;
        this.year = (year >= 2011 && year <= 2017) ? year : 0;
    }

    public Invoice(int invoiceNumber, float balanceDue, int day, int month, int year) {
        this.invoiceNumber = invoiceNumber < 1000 ? 0 : (short)invoiceNumber;
        this.balanceDue = balanceDue;
        this.day = (day >= 1 && day <= 31) ? (short)day : 0;
        this.month = (month >= 1 && month <= 12) ? (short)month : 0;
        this.year = (year >= 2011 && year <= 2017) ? (short)year : 0;
    }

    public Invoice(int invoiceNumber, double balanceDue, int day, int month, int year) {
        this.invoiceNumber = invoiceNumber < 1000 ? 0 : (short)invoiceNumber;
        this.balanceDue = (float)balanceDue;
        this.day = (day >= 1 && day <= 31) ? (short)day : 0;
        this.month = (month >= 1 && month <= 12) ? (short)month : 0;
        this.year = (year >= 2011 && year <= 2017) ? (short)year : 0;
    }

    public short getInvoiceNumber() {
        return invoiceNumber;
    }

    public float getBalanceDue() {
        return balanceDue;
    }

    public short getDay() {
        return day;
    }

    public short getMonth() {
        return month;
    }

    public short getYear() {
        return year;
    }

    public void display() {
        System.out.println("Invoice number: " + getInvoiceNumber() +
        "\nYour balance due is " + getBalanceDue() + 
        "\nYou have to pay it until: " + getYear() + '.' + getMonth() + '.' + getDay() + "\n");
    }

}