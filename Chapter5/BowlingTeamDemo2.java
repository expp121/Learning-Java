import java.util.Scanner;

public class BowlingTeamDemo2 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        String name;
        final int NUM_TEAMS = 4;
        final int NUM_TEAM_MEMBERS = 4;
        BowlingTeam[] bowlTeam = new BowlingTeam[NUM_TEAMS];

        for (int i = 0; i < NUM_TEAMS; i++) {
            bowlTeam[i] = new BowlingTeam();
            System.out.print("Enter team name >> ");
            name = input.nextLine();
            bowlTeam[i].setTeamName(name);
            for (int j = 0; j < NUM_TEAM_MEMBERS; j++) {
                System.out.print("Enter team member's name >> ");
                name = input.nextLine();
                bowlTeam[i].setMember(j, name);
            }
        }

        for (int i = 0; i < NUM_TEAMS; i++) {
            System.out.println("\nMembers of team " + bowlTeam[i].getTeamName());
            for (int j = 0; j < NUM_TEAM_MEMBERS; j++)
                System.out.print(bowlTeam[i].getMember(j) + " ");
            System.out.println();
        }
        input.close();
    }
}