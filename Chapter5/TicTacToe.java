import java.util.ArrayList;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TicTacToe {
    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        ArrayList<String> boardL = new ArrayList<String>();
        StringBuilder boardToString = new StringBuilder();
        StringBuilder choice = new StringBuilder();
        byte pcChoice;
        boolean hasSpace = false;

        for (int i = 0; i < 9; i++) {
            boardL.add((i + 1) + "");
            boardToString.append(boardL.get(i) + " ");
            if ((i + 1) % 3 == 0)
                boardToString.append("\n");
        }

        JOptionPane.showMessageDialog(null, "Welcome to Tic Tac Toe.\n You will have X and the computer will have O");
        do {
            for (int i = 0; i < boardL.size(); i++) {
                if (!(boardL.get(i).contains("X") || boardL.get(i).contains("O"))) {
                    hasSpace = true;
                }
            }
            for (int i = 0; i < 3; i++) {
                if (boardL.get(2 + (2 * i) + i - 1).equals(boardL.get(2 + (2 * i) + i - 2))
                        && boardL.get(2 + (2 * i) + i - 1).equals(boardL.get(2 + (2 * i) + i))) {
                    if (boardL.get(2 + (2 * i) + i - 1).equals("X")) {
                        JOptionPane.showMessageDialog(null, "Player Wins");
                        return;
                    } else if (boardL.get(2 + (2 * i) + i).equals("O")) {
                        JOptionPane.showMessageDialog(null, "Computer wins Wins");
                        return;
                    }
                }
            }

            choice.delete(0, choice.length());
            choice.append(JOptionPane.showInputDialog(null,
                    "Enter the position where you want to play\n" + boardToString.toString()));
            if (!(boardL.get(Byte.parseByte(choice.toString()) - 1).equals("X")
                    || boardL.get(Byte.parseByte(choice.toString()) - 1).equals("O"))) {

                boardL.set(Byte.parseByte(choice.toString()) - 1, "X");
                boardToString = reDrawBoard(boardToString, boardL);
            }

            JOptionPane.showMessageDialog(null,
                    "Your move is recorded;\nnow the computer will play\n" + boardToString.toString());

            do {
                pcChoice = (byte) ((Math.random() * 9) + 1);
            } while (pcChoice == Byte.parseByte(choice.toString())
                    || (boardL.get(pcChoice - 1).equals("X") || boardL.get(pcChoice - 1).equals("O")));

            boardL.set(pcChoice - 1, "O");
            boardToString = reDrawBoard(boardToString, boardL);

            JOptionPane.showMessageDialog(null, "The Computer played\n" + boardToString.toString());

        } while (hasSpace);

        input.close();
    }

    public static StringBuilder reDrawBoard(StringBuilder boardToString, ArrayList<String> boardL) {

        boardToString.delete(0, boardToString.length());
        for (int i = 0; i < 9; i++) {
            boardToString.append(boardL.get(i) + " ");
            if ((i + 1) % 3 == 0)
                boardToString.append("\n");
        }
        return boardToString;
    }
}