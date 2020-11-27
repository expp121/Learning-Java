import java.util.Scanner;

class EvenEntryLoop{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int number;
        
        do{
            System.out.print("\n\nWrite an even number to continue(999 to terminate): ");
            number = input.nextInt();

            if(number % 2 ==0)
                System.out.println("Good Job!");
            else if (number == 999)
                System.out.println("BYE!!");
            else System.out.println("Wrong number!");

        } while(number != 999);
        
        input.close();
    }
}