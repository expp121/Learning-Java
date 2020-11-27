/**
 * MathTest
 */
public class MathTest {

    public static void main(String[] args) {
        System.out.println("The square root of 37 is: " + Math.sqrt(37));
        System.out.println("The sine and cosine of 300 are: " + Math.sin(300) + " and " + Math.cos(300));
        System.out.println("The values of the floor, ceiling, and round of 22.8 are: " + Math.floor(22.8) + "|" + Math.ceil(22.8) + "|" + Math.round(22.8));
        System.out.println("The smaller of the character \"D\" and the integer 71: " + Math.min('D', 71));
        System.out.println("The larger of the character \"D\" and the integer 71: " + Math.max('D', 71));
        System.out.println("Random number between 0 and 20: " + (byte)(Math.random()*20));
    }
}