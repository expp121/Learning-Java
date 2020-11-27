import java.util.Scanner;

public class BowlingTeamDemo4 {
    public static Scanner input = new Scanner(System.in);
    private static String name;
    private static final int NUM_TEAMS = 4;
    private static final int NUM_TEAM_MEMBERS = 4;

    public static void main(String Args[]) {
        BowlingTeam[] bowlTeam = new BowlingTeam[NUM_TEAMS];

        getTeamData(bowlTeam);

        for (int i = 0; i < NUM_TEAMS; i++) {
            System.out.println("\nMembers of team " + bowlTeam[i].getTeamName());
            for (int j = 0; j < NUM_TEAM_MEMBERS; j++)
                System.out.print(bowlTeam[i].getMember(j) + " ");
            System.out.println();
        }

        System.out.print("\n\nEnter a team name to see its roster >> ");
        name = input.nextLine();

        for (int i = 0; i < NUM_TEAMS; i++)
            if (name.equals(bowlTeam[i].getTeamName()))
                for (int j = 0; j < bowlTeam.length; j++)
                    System.out.print(bowlTeam[i].getMember(j) + " ");
        System.out.println();
        input.close();
    }

    public static void getTeamData(BowlingTeam[] teams) {

        for (int i = 0; i < NUM_TEAMS; i++) {
            teams[i] = new BowlingTeam();
            System.out.print("Enter team name >> ");
            name = input.nextLine();
            teams[i].setTeamName(name);
            for (int j = 0; j < NUM_TEAM_MEMBERS; j++) {
                System.out.print("Enter team member's name >> ");
                name = input.nextLine();
                teams[i].setMember(j, name);
            }
        }
    }
}