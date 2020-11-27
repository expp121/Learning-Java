import java.util.Scanner;

class SumIntegersInString {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        String numbers;
        int sum = 0;
        System.out.print("Enter numbers devided by space: ");
        numbers = input.nextLine();
        String number[] = numbers.split(" ");
        for (int i = 0; i < number.length; i++) {
            sum += Integer.parseInt(number[i]);
        }
        System.out.println("The sum of the numbers is:" + sum);
        input.close();
    }
}