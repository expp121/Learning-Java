import java.util.Scanner;
/**
 * GasPrices
 */
public class GasPrices {

    public static void main(String[] args) {
        int pricePerBarrel;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a price for a barrel of fuel: ");
        pricePerBarrel = input.nextInt();
        calcPrice(pricePerBarrel);
        input.close();
    }
    public static void calcPrice(int barrelPrice){
        System.out.print("The price at the pump is : $"+ barrelPrice/25.0F + " and $"+ barrelPrice/28.5714F);
    }
}