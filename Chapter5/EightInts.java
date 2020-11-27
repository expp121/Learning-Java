public class EightInts {

    public static void main(String Args[]) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

    }
}