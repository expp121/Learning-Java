import java.util.Scanner;

class CountSpaces2 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        String sentence;
        int numOfSpaces = 0;

        System.out.print("Please enter a sentence!\n:");
        sentence = input.nextLine();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                numOfSpaces++;
            }
        }

        System.out.println("Your sentence has " + numOfSpaces + " spaces.");
        input.close();
    }
}