import java.util.Scanner;
/**
 * ArithmeticMethods
 */
public class ArithmeticMethods {

    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("a=");a=input.nextInt();
        System.out.print("b=");b=input.nextInt();
        displayNumberPlus10(a);
        displayNumberPlus100(a);
        displayNumberPlus1000(a);
        
        displayNumberPlus10(b);
        displayNumberPlus100(b);
        displayNumberPlus1000(b);
        input.close();
    }
    public static void displayNumberPlus10(int number){
        System.out.println(number+10);
    }
    
    public static void displayNumberPlus100(int number){
        System.out.println(number+100);
    }
    
    public static void displayNumberPlus1000(int number){
        System.out.println(number+1000);
    }
}