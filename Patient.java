/**
 * Patient
 */
public class Patient {
    private short idNumber;
    private byte age;
    BloodData bloodData;

    public Patient() {
        this.idNumber = 0;
        this.age = 0;
        bloodData = new BloodData();
    }

    public Patient(short idNumber, byte age){
        this.idNumber = idNumber;
        this.age = age;
    }

    public Patient(String bloodType, char factor) {
        this.bloodData = new BloodData(bloodType, factor);
    }
    public Patient(short idNumber, byte age, String bloodType, char factor) {
        this.idNumber = idNumber;
        this.age = age;
        this.bloodData = new BloodData(bloodType, factor);
    }

    public short getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(short idNumber) {
        this.idNumber = idNumber;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
    
}