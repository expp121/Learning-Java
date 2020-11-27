import java.util.Scanner;


class CreatePurchase{

    public static Scanner input = new Scanner(System.in);
  public static void main(String Args[])
  {
      short invoiceNumber;
      float saleAmount;

      Purchase purchase = new Purchase();
      System.out.println("Enter the purchase's details");
      do {
        System.out.print("Enter Invoice number between 1000 and 8000:");
        invoiceNumber = input.nextShort();   
      } while (invoiceNumber < 1000 || invoiceNumber > 8000);

      do {
        System.out.print("Enter the Sales Amount:");
        saleAmount = input.nextFloat();
      } while (saleAmount < 1);

      purchase.setInvoiceNumber(invoiceNumber);
      purchase.set(saleAmount);
      purchase.dispaly();
      input.close();

  }
}