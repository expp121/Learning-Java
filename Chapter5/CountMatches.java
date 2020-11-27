import java.util.Scanner;

class CountMatches {
    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {

        System.out.print("Enter the first word: ");
        StringBuilder word1 = new StringBuilder(input.nextLine());
        System.out.print("Enter the second word: ");
        StringBuilder word2 = new StringBuilder(input.nextLine());

        int simillarLetters = 0;
        StringBuilder simmilarLetters = new StringBuilder();

        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    simillarLetters++;
                    simmilarLetters.append(word1.charAt(i) + " ");
                }
            }
        }
        System.out.println(simillarLetters + " characters in " + word1 + " that are also in " + word2
                + " are as follows:\n" + simmilarLetters);
        input.close();
    }
}