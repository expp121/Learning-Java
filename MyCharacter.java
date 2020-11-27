/**
 * MyCharacter
 */
public class MyCharacter {

    byte lifePoint;
    byte numOfLives;
    int stamina;
    int strength;

    MyCharacter(){
        lifePoint = 0;
        numOfLives = 0;
        stamina = 0;
        strength = 0;
    }

    public byte getLifePoint() {
        return lifePoint;
    }

    public void setLifePoint(byte lifePoint) {
        this.lifePoint = lifePoint;
    }

    public byte getNumOfLives() {
        return numOfLives;
    }

    public void setNumOfLives(byte numOfLives) {
        this.numOfLives = numOfLives;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

}