import java.util.Scanner;

class Palindrome {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        String sentence;
        System.out.print("Enter a sentence to check if it's palidrome: ");
        sentence = input.nextLine();
        if (sentencePalindrome(sentence))
            System.out.println("Sentence is a Palidrome");
        else
            System.out.println("Sentence is not a Palidrome");
        input.close();

    }

    public static boolean sentencePalindrome(String str) {
        int l = 0;
        int h = str.length() - 1;

        // Lowercase string
        str = str.toLowerCase();

        // Compares character until they are equal
        while (l <= h) {

            char getAtl = str.charAt(l);
            char getAth = str.charAt(h);

            // If there is another symbol in left
            // of sentence
            if (!(getAtl >= 'a' && getAtl <= 'z'))
                l++;

            // If there is another symbol in right
            // of sentence
            else if (!(getAth >= 'a' && getAth <= 'z'))
                h--;

            // If characters are equal
            else if (getAtl == getAth) {
                l++;
                h--;
            }

            // If characters are not equal then
            // sentence is not palindrome
            else
                return false;
        }

        // Returns true if sentence is palindrome
        return true;
    }

    public static boolean isPalidrome(String sentence) {
        short startPos = 0, endPos = (short) (sentence.length() - 1);

        while (startPos <= endPos) {

            if (sentence.charAt(startPos) >= 'a' && sentence.charAt(startPos) <= 'z')
                startPos++;

            else if (sentence.charAt(endPos) >= 'a' && sentence.charAt(endPos) <= 'z')
                endPos--;

            else if (sentence.charAt(startPos) == sentence.charAt(endPos)) {
                startPos++;
                endPos--;
            } else
                return false;
        }
        return true;
    }

}