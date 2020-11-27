/**
 * Invoice
 */
public class Invoice2 {

    private short invoiceNumber;
    private float balanceDue;
    private short day;
    private short month;
    private short year;


    public Invoice2(short invoiceNumber, float balanceDue, short day, short month, short year) {
        this.invoiceNumber = invoiceNumber < 1000 ? 0 : invoiceNumber;
        this.balanceDue = balanceDue;
        this.month = (month >= 1 && month <= 12) ? month : 0;
        this.year = (year >= 2011 && year <= 2017) ? year : 0;
        if(this.month != 0) {
            
            if(day > 0){
            
                switch (month) {
                    case 1:
                        this.day = (day <= 31) ? day : 31;        
                    break;
                        
                    case 2:
                        this.day = (day <= 29) ? day : 29;
                    break;
                    
                    case 3:
                        this.day = (day <= 31) ? day : 31;
                    break;
                    
                    case 4:
                        this.day = (day <= 30) ? day : 31;
                    break;

                    case 5:
                        this.day = (day <= 31) ? day : 31;
                    break;

                    case 6:
                        this.day = (day <= 30) ? day : 30;
                    break;

                    case 7:
                        this.day = (day <= 31) ? day : 31;
                    break;

                    case 8:
                        this.day = (day <= 31) ? day : 31;
                    break;

                    case 9:
                        this.day = (day <= 30) ? day : 30;
                    break;

                    case 10:
                        this.day = (day <= 31) ? day : 31;
                    break;

                    case 11:
                        this.day = (day <= 30) ? day : 30;
                    break;

                    case 12:
                        this.day = (day <= 31) ? day : 31;
                    break;
                
                    default:
                        this.day = 0;
                        break;
                }
            }
            else this.day = 0;
        }
 
    }

    public Invoice2(int invoiceNumber, float balanceDue, int day, int month, int year) {
        this.invoiceNumber = invoiceNumber < 1000 ? 0 : (short)invoiceNumber;
        this.balanceDue = balanceDue;
        this.month = (month >= 1 && month <= 12) ? (short)month : 0;
        this.year = (year >= 2011 && year <= 2017) ? (short)year : 0;
        
        if(this.month != 0) {
            
            if(day > 0){
            
                switch (month) {
                    case 1:
                        this.day = (day <= 31) ? (short)day : 31;        
                    break;
                        
                    case 2:
                        this.day = (day <= 29) ? (short)day : 29;
                    break;
                    
                    case 3:
                        this.day = (day <= 31) ? (short)day : 31;
                    break;
                    
                    case 4:
                        this.day = (day <= 30) ? (short)day : 30;
                    break;

                    case 5:
                        this.day = (day <= 31) ? (short)day : 31;
                    break;

                    case 6:
                        this.day = (day <= 30) ? (short)day : 30;
                    break;

                    case 7:
                        this.day = (day <= 31) ? (short)day : 31;
                    break;

                    case 8:
                        this.day = (day <= 31) ? (short)day : 31;
                    break;

                    case 9:
                        this.day = (day <= 30) ? (short)day : 30;
                    break;

                    case 10:
                        this.day = (day <= 31) ? (short)day : 31;
                    break;

                    case 11:
                        this.day = (day <= 30) ? (short)day : 30;
                    break;

                    case 12:
                        this.day = (day <= 31) ? (short)day : 31;
                    break;
                
                    default:
                        this.day = 0;
                    break;
                }
            }
            else this.day = 0;
        }
    }

    public Invoice2(int invoiceNumber, double balanceDue, int day, int month, int year) {
        this.invoiceNumber = invoiceNumber < 1000 ? 0 : (short)invoiceNumber;
        this.balanceDue = (float)balanceDue;
        this.year = (year >= 2011 && year <= 2017) ? (short)year : 0;
        this.month = (month >= 1 && month <= 12) ? (short)month : 0;

        if(this.month != 0) {
            
            if(day > 0){
            
                switch (month) {
                    case 1:
                        this.day = (day <= 31) ? (short)day : 31;        
                    break;
                        
                    case 2:
                        this.day = (day <= 29) ? (short)day : 29;
                    break;
                    
                    case 3:
                        this.day = (day <= 31) ? (short)day : 31;
                    break;
                    
                    case 4:
                        this.day = (day <= 30) ? (short)day : 30;
                    break;

                    case 5:
                        this.day = (day <= 31) ? (short)day : 31;
                    break;

                    case 6:
                        this.day = (day <= 30) ? (short)day : 30;
                    break;

                    case 7:
                        this.day = (day <= 31) ? (short)day : 31;
                    break;

                    case 8:
                        this.day = (day <= 31) ? (short)day : 31;
                    break;

                    case 9:
                        this.day = (day <= 30) ? (short)day : 30;
                    break;

                    case 10:
                        this.day = (day <= 31) ? (short)day : 31;
                    break;

                    case 11:
                        this.day = (day <= 30) ? (short)day : 30;
                    break;

                    case 12:
                        this.day = (day <= 31) ? (short)day : 31;
                    break;
                
                    default:
                        this.day = 0;
                        break;
                }
            }
            else this.day = 0;
        }
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