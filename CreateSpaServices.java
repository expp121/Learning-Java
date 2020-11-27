import java.util.Scanner;
    
/**
 * CreateSpaServices
 */
public class CreateSpaServices 
{
    public static void main(String[] args) 
    {
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        firstService = getData();
        secondService = getData();
        System.out.println("\n\nFirst Service Details:\n"+firstService.getServiceDescription()+ "\t$"+firstService.getPrice()+"\n\n");
        System.out.println("\n\nSecond Service Details:\n"+ secondService.getServiceDescription() + "\t$" + secondService.getPrice() +"\n\n");
    }
    public static SpaService getData() {
        String service;
        float price;
        Scanner input=new Scanner(System.in);
        SpaService obj= new SpaService();
        System.out.print("Enter a service: ");
        service= input.nextLine();
        System.out.print("Enter a price: ");
        price= input.nextFloat();
        input.nextLine();
        obj.setServiceDesctiption(service);
        obj.setPrice(price);
        input.close();
        return obj;
    }
    
}