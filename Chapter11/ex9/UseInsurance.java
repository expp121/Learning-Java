package ex9;

public class UseInsurance {
    public static void main(String[] args) {
        Insurance[] insurances = new Insurance[2];
        insurances[0] = new Health();
        insurances[1] = new Life();
        for (int i = 0; i < insurances.length; i++)
            insurances[i].display();
    }
}
