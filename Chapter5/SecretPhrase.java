import java.util.Scanner;

class SecretPhrase {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        String words[] = { "Fish", "Go Team", "Anatoli has big pp", "Drivethrough", "PingPong", "Front Lever" };
        char letter = ' ';
        byte choosenWord = (byte) (Math.random() * 100 % 6);
        StringBuilder word = new StringBuilder(words[choosenWord]);

        word.replace(0, word.length(), word.toString().replaceAll("[a-z]", "*"));
        System.out.println("The word is: " + word);

        while (!word.toString().equals(words[choosenWord])) {
            System.out.print("Enter a letter: ");
            letter = input.next().charAt(0);

            for (int i = 0; i < words[choosenWord].length(); i++) {

                if (letter == words[choosenWord].charAt(i) && (word.toString().charAt(i) == '*'))
                    word.replace(i, i + 1, Character.toString(letter));
            }

            System.out.println(word.toString());

        }
        input.close();

    }
}