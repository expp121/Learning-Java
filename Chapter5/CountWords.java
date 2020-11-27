import java.util.Scanner;

class CountWords {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        System.out.print("Write a sentence: ");
        String sentence;
        int words = 0;

        sentence = input.nextLine();
        for (int i = 0; i < sentence.length(); i++) {
            if (!Character.isLetter(sentence.charAt(i)) && !Character.isWhitespace(sentence.charAt(i))) {
                words++;
            }
        }
        System.out.print("Word: " + words);
        input.close();
    }
}