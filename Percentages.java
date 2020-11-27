import java.util.Scanner;

/**
 * Percentages
 */
public class Percentages {

    public static void main(String[] args) {
        double a,b;
        Scanner input= new Scanner(System.in);
        System.out.print("A: ");a=input.nextDouble();
        System.out.print("B: ");b=input.nextDouble();   
        computePercent(a, b);
        input.close();
    }
    public static void computePercent(double a, double b) {
        System.out.println(a+" is "+ (a/b)*100 +"% of "+ b);
    }
}