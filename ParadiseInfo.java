import java.util.Scanner;

public class ParadiseInfo
{
    public static void main(String[] args) {
     
        float minimumPriceForDiscount;
        short discountRate;
        float minimumSaving;
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter cutoff price for discount: ");
        minimumPriceForDiscount= input.nextFloat();
        
        System.out.print("Enter discount rate as a whole number: ");
        discountRate= input.nextShort();
        
        minimumSaving= computeDiscountInfo(minimumPriceForDiscount,discountRate);
        
        System.out.println("Special this week on any service over "+ minimumPriceForDiscount);
        System.out.println("Discount of "+ discountRate + " percent");
        System.out.println("That's a savings of at least $"+minimumSaving);
     
        displayInfo();
        input.close();
    }

    public static float computeDiscountInfo(float price,short discount_rate){
        return price*discount_rate/100;
    }

    public static void displayInfo()
    {  
        
        System.out.println("Paradise Day Spa wants to pamper you.");
        System.out.println("We will make you look good.");
    }
}   