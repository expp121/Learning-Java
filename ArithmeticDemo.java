import java.util.Scanner;

public class ArithmeticDemo
{
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        double average;

        Scanner input= new Scanner(System.in);

        System.out.print("Please enter an Int: ");
        firstNumber=input.nextInt();
        System.out.print("Please enter another Int: ");
        secondNumber=input.nextInt();
        sum=firstNumber+secondNumber;
        difference=firstNumber-secondNumber;
        average=sum/2.0;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println("The average of "+ firstNumber + " and "+ secondNumber + " is "+ average);
        System.out.println(13%15);
        input.close();
    }
}