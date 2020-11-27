import java.util.Scanner;

class CondoSales
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        byte choise;
        System.out.print("1. For park view\n2. For golf course view\n3. For lake view\nChoose a condominium:");
        choise = input.nextByte();

        switch (choise) {
            case 1:
                System.out.println("Park view condos are $150,000.");
                break;

            case 2:
                System.out.println("Golf course views are $170,000.");
                break;

            case 3:
                System.out.println("Lake views are $210,000.");
                break;
    
            default:
                System.out.println("Invalid choise is $0.");
                break;
        }
    }   

}