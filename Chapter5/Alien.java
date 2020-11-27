public class Alien {
    protected byte numberOfEyes;
    protected byte numberOfLegs;
    protected boolean isBipedal;
    
    public Alien(byte numberOfEyes, byte numberOfLegs, boolean isBiPedal){
        this.numberOfEyes = numberOfEyes;
        this.numberOfLegs = numberOfLegs;
        this.isBipedal = isBiPedal;
    }
    
    public Alien(int numberOfEyes, int numberOfLegs, boolean isBiPedal){
        this.numberOfEyes = (byte)numberOfEyes;
        this.numberOfLegs = (byte)numberOfLegs;
        this.isBipedal = isBiPedal;
    }    

    public String toString() {
        return ("Number of Eyes:" + this.numberOfEyes
        + "\nNumber of legs: " + this.numberOfLegs
        + "\nIs Bipedal: " + (this.isBipedal == true ? "Yes":"No"));
    }
}
