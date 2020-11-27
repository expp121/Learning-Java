import java.util.Scanner;

public class Eliza {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {

        StringBuilder sentence = new StringBuilder(" ");
        StringBuilder word = new StringBuilder(" ");
        String respones[] = { "Please go on", "Tell me more", "Continue" };

        System.out.println("\n\nHow's your day been going?");
        while (!sentence.toString().toLowerCase().equals("goodbye")) {
            sentence.delete(0, sentence.length());
            System.out.print(':');
            sentence.append(input.nextLine());

            if (sentence.toString().contains("love") || sentence.toString().contains("hate"))
                System.out.println("You seem to have strong feelings about that");

            if (sentence.toString().contains(" my ")) {

                word.delete(0, word.length());
                word.append(sentence.toString().substring(sentence.toString().indexOf(" my ") + 4));
                word.replace(0, word.length(),
                        word.toString().substring(0, (word.toString().length() - 1) - word.toString().indexOf(" ")));
                System.out.println("\nTell me more about your " + word.toString());

            } else {
                System.out.println(respones[(byte) (Math.random() * 100 % 3)]);
            }

        }

        input.close();
    }
}
