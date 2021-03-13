package ex9;
import ex9.Health;
import ex9.Insurance;
import ex9.Life;
public class UseInsurance {
    public static void main(String[] args) {
        Insurance[] insurances = new Insurance[2];
        insurances[0] = new Health();
        insurances[1] = new Life();
        for (int i = 0; i < insurances.length; i++)
            insurances[i].display();
    }
}
