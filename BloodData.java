/**
 * BloodData
 */
public class BloodData {
    private String bloodType;
    private char RhFactor;

    public BloodData() {
        bloodType = "O";
        RhFactor = '+';
    }

    public BloodData(String bloodType, char factor) {
        if(bloodType == "A" || bloodType == "B" || bloodType == "O" || bloodType == "AB")
            this.bloodType = bloodType;

        if(factor == '-' || factor == '+')
            this.RhFactor = factor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public char getRhFactor() {
        return RhFactor;
    }

    public void setRhFactor(char rhFactor) {
        RhFactor = rhFactor;
    }
        
}