/**
 * TestInvoice
 */
public class TestInvoice {

    public static void main(String[] args) {
        Invoice invoice = new Invoice((short)1233, 22.1f, (short)25, (short)3, (short)2015),
         invoice2 = new Invoice(433, 231.2, 1, 1, 1), 
         invoice3 = new Invoice(1881, 434.231, 2, 5, 2011);

         invoice.display();
         invoice2.display();
         invoice3.display();
    }
}