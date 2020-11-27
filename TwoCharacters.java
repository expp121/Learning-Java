import java.util.Scanner;/**
 * TwoCharacters
 */
public class TwoCharacters {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        MyCharacter character1 = new MyCharacter(),
        character2 = new MyCharacter();

        character1 = initCharacter(character1);
        character2 = initCharacter(character2);

        displayCharacter(character1);
        displayCharacter(character2);
        
        input.close();
    }
    public static MyCharacter initCharacter(MyCharacter character) {
        System.out.print("Enter the character's life points: ");
        character.setLifePoint(input.nextByte());
        System.out.print("Lives left: ");
        character.setNumOfLives(input.nextByte());
        System.out.print("Stamina: ");
        character.setStamina(input.nextInt());
        System.out.print("Strength: ");
        character.setStrength(input.nextInt());
        System.out.print("\n\n");
        return character;
    }
    public static void displayCharacter(MyCharacter character) {
        System.out.print("\n-----------------------\nLife Points left: " + character.getLifePoint() + 
        "\nLives Left: " + character.getNumOfLives() + 
        "\n\n---------STATS---------\nStrength: " + character.getStrength() + 
        "\nStamina: " + character.getStamina() + "\n\n");
    }
}