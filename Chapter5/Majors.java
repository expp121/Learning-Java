import java.util.Scanner;

public class Majors {

    public static Scanner input = new Scanner(System.in);

    enum majors {
        ACC("Business Division"), CHEM("Science Division"), CIS("Business Division"), ENG("Humanities Division"),
        HIS("Humanities Division"), PHYS("Science Division");

        private String major;

        public String getMajor() {
            return this.major;
        }

        private majors(String major) {
            this.major = major;
        }
    }

    public static void main(String[] args) {
        String major;
        for (int i = 0; i < majors.values().length; i++)
            System.out.print(majors.values()[i] + " ");
        System.out.print("Please enter a major: ");
        major = input.nextLine().toUpperCase();
        System.out.println(
                majors.valueOf(major) + " is in " + majors.values()[majors.valueOf(major).ordinal()].getMajor());
    }

}