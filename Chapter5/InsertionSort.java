
import java.util.Scanner;

public class InsertionSort {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        int[] someNums = new int[5];

        int a = 1, b, temp;
        for (int i = 0; i < someNums.length; i++) {
            System.out.print("Enter a number " + (i + 1) + " >> ");
            someNums[i] = input.nextInt();

        }
        display(someNums, 0);
        while (a < someNums.length) {
            temp = someNums[a];
            b = a - 1;
            while (b >= 0 && someNums[b] > temp) {
                someNums[b + 1] = someNums[b];
                --b;
            }
            someNums[b + 1] = temp;
            display(someNums, a);
            ++a;
        }
    }

    public static void display(int[] someNums, int a) {
        System.out.print("Iteration " + a + ": ");
        for (int i = 0; i < someNums.length; i++)
            System.out.print(someNums[i] + " ");
        System.out.println();
    }
}
