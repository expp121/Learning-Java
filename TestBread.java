/**
 * TestBread
 */
public class TestBread {

    public static void main(String[] args) {
        Bread blackBread  = new Bread("Black", (short)40);
        Bread whiteBread = new Bread("White", (short)30);
        System.out.println(Bread.MOTTO);
        System.out.println(blackBread.getType() + " bread is " + blackBread.getCaloriesPerSlice() + " per slice.");
        System.out.println(whiteBread.getType() + " bread is " + whiteBread.getCaloriesPerSlice() + " per slice.");

    }
}