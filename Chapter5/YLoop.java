import javax.swing.JOptionPane;

class YLoop {

    public static void main(String Args[]) {
        final char YES_OPTION = 'y';
        String entryString;
        char entryChar;
        int count = 0;

        entryString = JOptionPane.showInputDialog(null, "Do you want to see a greating?");
        entryChar = entryString.charAt(0);

        while (Character.toLowerCase(entryChar) == YES_OPTION) {

            ++count;
            entryString = JOptionPane.showInputDialog(null,
                    "Greeting #" + count + "\nHello!\nDo you want to see another greeting?");
            entryChar = entryString.charAt(0);

        }

    }

}