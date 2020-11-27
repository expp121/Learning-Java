import java.util.Arrays;
import java.util.Scanner;

public class MeanMedian {
    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        int[] numbers = new int[5];
        int mean = 0, meadian;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("[" + i + "]= ");
            numbers[i] = input.nextInt();
            mean += numbers[i];
        }
        Arrays.sort(numbers);
        meadian = numbers[2];

        System.out.println("Mean: " + (mean / 5) + "\nMeadian: " + meadian);

    }
}