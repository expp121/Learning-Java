public class BowlingTeam {
    private String teamName;
    private String[] members = new String[4];

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setMember(int number, String name) {
        this.members[number] = name;
    }

    public String getMember(int number) {
        return this.members[number];
    }

}