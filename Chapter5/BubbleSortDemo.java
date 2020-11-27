import java.util.Scanner;

public class BubbleSortDemo {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        int[] someNums = new int[5];
        int comparisonsToMake = someNums.length - 1;
        int temp;
        for (int i = 0; i < someNums.length; i++) {
            System.out.print("Enter a number " + (i + 1) + " >> ");
            someNums[i] = input.nextInt();

        }
        display(someNums, 0);
        for (int i = 0; i < someNums.length; i++) {
            for (int j = 0; j < comparisonsToMake; j++) {
                if (someNums[j] > someNums[j + 1]) {
                    temp = someNums[j];
                    someNums[j] = someNums[j + 1];
                    someNums[j + 1] = temp;
                }
            }
            display(someNums, (i + 1));
            --comparisonsToMake;
        }

    }

    public static void display(int[] someNums, int a) {
        System.out.print("Iteration " + a + ": ");
        for (int i = 0; i < someNums.length; i++)
            System.out.print(someNums[i] + " ");
        System.out.println();
    }
}