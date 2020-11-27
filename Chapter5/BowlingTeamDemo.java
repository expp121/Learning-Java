import java.util.Scanner;

public class BowlingTeamDemo {
    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        String name;
        BowlingTeam bowlTeam = new BowlingTeam();
        final int NUM_TEAM_MEMBERS = 4;
        System.out.print("Enter team name >> ");
        name = input.nextLine();
        bowlTeam.setTeamName(name);
        for (int i = 0; i < NUM_TEAM_MEMBERS; i++) {
            System.out.print("Enter team member's name >> ");
            name = input.nextLine();
            bowlTeam.setMember(i, name);

        }
        System.out.println("\nMembers of team " + bowlTeam.getTeamName());
        for (int i = 0; i < NUM_TEAM_MEMBERS; i++)
            System.out.print(bowlTeam.getMember(i) + " ");
        System.out.println();

        input.close();

    }
}