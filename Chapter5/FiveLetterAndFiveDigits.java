import java.util.Scanner;

class FiveLetterAndFiveDigits {
    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        StringBuilder sentence = new StringBuilder();
        byte letters = 0, numbers = 0;
        System.out.println("Please enter 5 numbers and letters.");

        while (true) {
            System.out.print(":");
            sentence = new StringBuilder(input.nextLine());

            for (int i = 0; i < sentence.length(); i++) {

                if (Character.isDigit(sentence.toString().charAt(i)))
                    numbers++;

                if (Character.isLetter(sentence.toString().charAt(i)))
                    letters++;
            }
            if (numbers > 4 && letters > 4) {
                System.out.println("You've entered correct sentence.");
                break;

            } else {

                if (letters < 5)
                    System.out.println("You need to enter at least " + (5 - letters) + " letters");

                if (numbers < 5)
                    System.out.println("You need to enter at least " + (5 - numbers) + " numbers");

                letters = 0;
                numbers = 0;
            }
        }
        input.close();
    }
}