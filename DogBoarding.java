import java.util.Scanner;

public class DogBoarding
{
    public static void main(String[] args) {
        final float COST_PER_POUND=0.50f;
        Scanner input= new Scanner(System.in);
        float dogWeight;
        byte days;
        System.out.print("Hello. So you want to board your dog, but first i will need a little bit of information?\nFirstly how much weights(pounds) your dog: ");
        dogWeight= input.nextFloat();
        System.out.print("And secondly, for how many days you want it to be boarded?: ");days=input.nextByte();
        System.out.print("OK, that will cost you $" + COST_PER_POUND*dogWeight*days);
        input.close();
    }
}    