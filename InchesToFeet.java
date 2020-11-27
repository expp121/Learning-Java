import java.util.Scanner;

public class InchesToFeet
{
    public static void main(String[] args) {
        float inches;
        byte feet,leftInches;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many inches to conver:");inches=input.nextFloat();
        feet=(byte)(inches/12);
        leftInches=(byte)(inches%12);

        System.out.print("The result is "+ feet + " feet and "+ leftInches + " inches.");
        input.close();
    }
}