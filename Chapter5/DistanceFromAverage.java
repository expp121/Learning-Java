import java.util.Scanner;

public class DistanceFromAverage {
    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        double[] numbers = new double[10];
        int elements = 0;
        double number = 0, avg = 0.0;

        do {
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            if (number != 99999) {
                numbers[elements] = number;
                avg += number;
            }
            elements++;

        } while (number != 99999 && elements < 9);

        if (elements == 0 && number == 99999)
            System.out.println("Error");
        avg /= (elements - 1);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("The distance of number " + numbers[i] + " from the average is "
                    + Math.abs(avg - numbers[i]) + "\n");
        }
    }
}