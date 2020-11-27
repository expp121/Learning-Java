import java.util.Scanner;

class CondoSales2
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        byte choise;
        byte carSpace;

        System.out.print("1. For park view\n2. For golf course view\n3. For lake view\nChoose a condominium:");
        choise = input.nextByte();

        if(choise == 1) {
            System.out.print("\nPlease also enter do you want:\n1.Garage\n2.Parking space\nAny other number for none.\n");
            carSpace = input.nextByte();

            if(carSpace == 1)
                System.out.println("Park view condos are $155,000.");
            else 
                System.out.println("Park view condos are $150,000.");
        }
        else if(choise == 2) {
            System.out.print("\nPlease also enter do you want:\n1.Garage\n2.Parking space\nAny other number for none.\n");
            carSpace = input.nextByte();

            if(carSpace == 1)
                System.out.println("Golf course views are $175,000.");
            else 
                System.out.println("Golf course views are $170,000.");
        }
        else if(choise == 3){
            System.out.print("\nPlease also enter do you want:\n1.Garage\n2.Parking space\nAny other number for none.\n");
            carSpace = input.nextByte();

            if(carSpace == 1)
                System.out.println("Lake views are $215,000.");
            else 
                System.out.println("Lake views are $210,000.");
        }
        else System.out.println("Invalid choise is $0.");
        input.close();
    }   
    
}