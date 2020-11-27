/**
 * TestBloodData
 */
public class TestBloodData {

    public static void main(String[] args) {
        BloodData gosho = new BloodData("B",'-');
        BloodData emo = new BloodData("A",'-');
        BloodData tornado = new BloodData("AB",'+');
        System.out.println("Gosho: " + gosho.getBloodType() + gosho.getRhFactor());
        System.out.println("Emo: " + emo.getBloodType() + emo.getRhFactor());
        System.out.println("Tornado: " + tornado.getBloodType() + tornado.getRhFactor());
    }
}