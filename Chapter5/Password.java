import java.util.Scanner;
import java.io.Console;

class Password {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        Console cmd = System.console();
        boolean hasAletter = false;
        boolean hasAdigit = false;

        StringBuilder password = new StringBuilder();
        StringBuilder repeat = new StringBuilder();

        if (cmd != null) {

            while ((password.length() < 6 || password.length() > 10) || (hasAdigit == false || hasAletter == false)) {
                password.delete(0, password.length());
                password.append(cmd.readPassword("Enter the password: "));
                for (int i = 0; i < password.length(); i++) {
                    if (Character.isLetter(password.charAt(i)))
                        hasAletter = true;
                    if (Character.isDigit(password.charAt(i)))
                        hasAdigit = true;
                }
            }

            while (true) {
                repeat.delete(0, repeat.length());
                repeat.append(cmd.readPassword("Please reenter the password: "));
                if (repeat.toString().equals(password.toString()))
                    break;
            }
        }

        input.close();

    }
}