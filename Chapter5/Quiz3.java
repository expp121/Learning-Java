import java.util.Scanner;

public class Quiz3 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        byte correctAnsers = 0;
        char answer = ' ';
        String[] questions = { "Why do chickens lay eggs?", "How are you?", "How are the kids? ",
                "What brand is your SSD?", "How did you sleep that night?", "What's your favourite colour? ",
                "Where have you been?", "What are you playing? ", "Where are you going?", "Do you like duners? " };

        String[][] answers = { { "A:Because they can.", "B:To leave offspring", "C:To be useful" },
                { "A:Good.", "B:Bad.", "C:Don't ask." }, { "A:Fine", "B:Not so good", "C:Don't know" },
                { "A:Kingston", "B:Seagate", "C:Samsung" }, { "A:Really Good", "B:Badly", "C:Haven't slept" },
                { "A:Purple", "B:Green", "C:Colourfull" }, { "A:Home", "B:At your home", "C:Nowhere" },
                { "A:League of Legends", "B:Minecraft", "C:osu!" },
                { "A:Going home", "B:Going to the neighbours", "C:Where the wind is blowing" },
                { "A:And you are asking?", "B:Yes", "C:No" } };

        String[] correstAnswers = { "C:To be useful", "C:Don't ask.", "A:Fine", "C:Samsung", "C:Haven't slept",
                "C:Colourfull", "B:At your home", "A:League of Legends", "C:Where the wind is blowing",
                "A:And you are asking?" };

        for (int i = 0; i < correstAnswers.length; i++) {

            System.out.println(questions[i]);

            for (int j = 0; j < 3; j++)
                System.out.println(answers[i][j]);

            do {
                System.out.print(":");
                answer = input.nextLine().charAt(0);
            } while (!Character.isLetter(answer) && !(answer == 'A' || answer == 'B' || answer == 'C'));

            if (answer == correstAnswers[i].charAt(0)) {
                correctAnsers++;
                System.out.println("Correct!");
            } else
                System.out.println("\n\nThe correct answers is: " + correstAnswers[i]);
        }

        System.out.println("You have guessed " + correctAnsers + " answers!");
        input.close();
    }
}