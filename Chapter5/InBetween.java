import java.util.Scanner;
class InBetween{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b;
        System.out.print("Enter two whole numbers\n1: ");
        a = input.nextInt();
        System.out.print("2: ");
        b = input.nextInt();
        if(Math.abs(a - b) > 1){
            if ((a -b) > 0)
            {
                for(int i = b + 1; i < a; i++)
                    System.out.print(i + " ");
            }
            else {
                for(int i = a + 1; i < b; i++)
                    System.out.print(i + " ");
            }
        }
        else System.out.println("No numbers between these two numbers!");
        System.out.print("\n\n");
    }

}