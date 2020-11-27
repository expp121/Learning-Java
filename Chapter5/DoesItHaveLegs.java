import java.util.ArrayList;
import java.util.Scanner;

public class DoesItHaveLegs {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        ArrayList<String> questions = new ArrayList<String>();
        ArrayList<String> answers = new ArrayList<String>();
        StringBuilder playerChoice = new StringBuilder();
        byte questionsToAsk;

        questions.add("Does the animal you are thinking of have legs?");
        answers.add("dog");

        questionsToAsk = (byte) questions.size();

        while (questionsToAsk > 0) {
            System.out.println(questions.get(questions.size() - questionsToAsk));// question // Does it have.....
            playerChoice = getInput(playerChoice);
            if (playerChoice.toString().toLowerCase().equals("yes")) {
                System.out.println("Is it a " + answers.get(questionsToAsk - 1)); // Is it a .....
                playerChoice = getInput(playerChoice);

                if (playerChoice.toString().toLowerCase().equals("yes")) {
                    System.out.println("Yay! I win. Do you want to play again?");
                    playerChoice = getInput(playerChoice);

                    if (playerChoice.toString().toLowerCase().equals("yes")) {
                        questionsToAsk = (byte) questions.size();
                        continue;
                    }

                    else if (playerChoice.toString().toLowerCase().equals("no"))
                        break;

                } else if (playerChoice.toString().toLowerCase().equals("no")) {

                    System.out.println("I give up. What was your animal?");
                    playerChoice = getInput(playerChoice);
                    answers.add(playerChoice.toString());
                    System.out.println("Type a question for which the answer is Yes for " + answers.get(questionsToAsk)
                            + " but No for " + answers.get(questionsToAsk - 1));
                    playerChoice = getInput(playerChoice);
                    questions.add(playerChoice.toString());
                    System.out.println("Do you want to play again?");
                    playerChoice = getInput(playerChoice);
                    if (playerChoice.toString().toLowerCase().equals("yes")) {
                        questionsToAsk = (byte) questions.size();
                        continue;
                    }

                    else if (playerChoice.toString().toLowerCase().equals("no"))
                        break;

                }

            } else if (playerChoice.toString().toLowerCase().equals("no")) {
                if (questionsToAsk - 1 > 0) {
                    continue;
                } else {
                    System.out.println("I give up. What was your animal?");
                    playerChoice = getInput(playerChoice);
                    answers.add(playerChoice.toString());
                    System.out.println("Type a question for which the answer is Yes for " + answers.get(questionsToAsk)
                            + " but No for " + answers.get(questionsToAsk - 1));
                    playerChoice = getInput(playerChoice);
                    questions.add(playerChoice.toString());
                    System.out.println("Do you want to play again?");
                    playerChoice = getInput(playerChoice);
                    if (playerChoice.toString().toLowerCase().equals("yes")) {
                        questionsToAsk = (byte) questions.size();
                        continue;
                    }

                    else if (playerChoice.toString().toLowerCase().equals("no"))
                        break;

                }
            }
        }

        input.close();
    }

    public static StringBuilder getInput(StringBuilder builder) {
        builder.delete(0, builder.length());
        builder.append(input.nextLine());
        return builder;
    }
}