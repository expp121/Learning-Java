/**
 * Billing
 */
public class Billing {

    public static float computeBill(float price) {
        return (float)price+(price*0.08f);
    }

    public static float computeBill(float price, short quantity) {
        return (float)(price*quantity+ (price*quantity*0.08f));
    }

    public static float computeBill(float price, short quantity, float couponVal) {
        return (float)((price*quantity)-couponVal)+(((price*quantity)-couponVal)*0.08f);
    }
    
    public static void main(String[] args) {
        System.out.println("First Method: " + computeBill(1.2f)); 
        System.out.println("Second Method: " + computeBill(1.2f, (short)10));
        System.out.println("Third Method: " + computeBill(1.2f, (short)10, 3.1f));
    }
}