/**
 * Purchase
 */
public class Purchase {

    private short invoiceNumber;
    private float saleAmount;
    private float salesTax;

    public void setInvoiceNumber(short invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void set(float saleAmount) {
        this.saleAmount = saleAmount;
        this.salesTax = saleAmount * 0.05f;
    }

    public short getInvoiceNumber() {
        return invoiceNumber;
    }

    public float getSaleAmount() {
        return saleAmount;
    }

    public float getSalesTax() {
        return salesTax;
    }

    public void dispaly() {
        System.out.println("Invoice Number: " + getInvoiceNumber() + 
                            "\nSale Amoint: " + getSaleAmount() + 
                            "\nSales Tax: " + getSalesTax());
    }

}