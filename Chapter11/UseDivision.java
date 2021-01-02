public class UseDivision {
    public static void main(String args[]) {
        DomesticDivision division = new DomesticDivision("Naruto Inc.", "EAo1", "Florida");
        InternnationalDivision intDivision = new InternnationalDivision("Sakura Inc.", "QQS1", "Bulgaria", "Bulgarian");
        division.display();
        intDivision.display();
    }
}