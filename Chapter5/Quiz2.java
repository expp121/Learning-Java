import java.util.Scanner;

class Quiz2 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        byte incorrectAnswers = 0;
        byte correctAnswers = 0;

        byte[] answers_num = { 3, 2, 3, 1, 1 };
        byte answered;

        String[][] answers = { { "Bangladesh", "Varna", "Sofia" },
                { "Shooting Star", "PSY Gangnam Style", "I beleive I can fly" },
                { "Sucking dicks", "Coding", "Playing Scribbl" }, { "Earth", "Mars", "Jupiter" },
                { "Da", "Ne", "Ne znam" } };

        String[] question = { "What is the capital of Bulgraia?:", "What was the most popular song in 2012?:",
                "What's Miksera's hobby?: ", "What's the third planet from our solar system?: ",
                "Shte te skusam dobre li e?: " };

        for (int i = 0; i < question.length; i++) {

            System.out.println(question[i]);

            for (int j = 0; j < answers[i].length; j++)
                System.out.println((j + 1) + "." + answers[i][j]);

            do {
                System.out.print(":");
                answered = input.nextByte();

            } while (answered < 1 || answered > 3);

            if (answered == answers_num[i]) {
                System.out.println("\nGood Job!\n");
                correctAnswers++;
            }

            else {
                System.out.println("\nWrong answer");
                System.out.println("The correct answer was " + answers[i][answers_num[i] - 1] + "\n");
                incorrectAnswers++;
            }

        }
        System.out.println(
                "You made " + incorrectAnswers + " mistakes\nAnd answered correctly " + correctAnswers + " question!");

        input.close();
    }
}