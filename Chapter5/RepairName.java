import javax.swing.JOptionPane;

class RepairName {

    public static void main(String Args[]) {

        String name, saveOriginalName;
        name = JOptionPane.showInputDialog(null, "Please enter your first and last name");
        saveOriginalName = name;
        char c;

        for (int i = 0; i < name.length(); i++) {

            c = name.charAt(i);
            if (i == 0) {
                c = Character.toUpperCase(c);
                name = c + name.substring(1, name.length());

            } else if (name.charAt(i) == ' ') {
                ++i;
                c = name.charAt(i);
                c = Character.toUpperCase(c);
                name = name.substring(0, i) + c + name.substring(i + 1, name.length());

            }
        }

        JOptionPane.showMessageDialog(null, "Original name was " + saveOriginalName + "\nRepaired name is " + name);

    }
}