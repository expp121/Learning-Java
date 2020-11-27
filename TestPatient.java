/**
 * TestPatient
 */
public class TestPatient {

    public static void main(String[] args) {
        Patient goshko = new Patient((short)1,(byte)12,"AB",'-');
        System.out.println("ID: " + goshko.getIdNumber() + "\nAge: " + goshko.getAge() + "\nBlood Type: " + 
        goshko.bloodData.getBloodType() + goshko.bloodData.getRhFactor());
    }
}