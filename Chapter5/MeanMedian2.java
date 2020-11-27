import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MeanMedian2 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int counter = 0;
        float mean = 0f, meadian;
        for (int i = 0; i < 20; i++) {
            System.out.print("[" + i + "]= ");
            arrayList.add(input.nextInt());
            if (arrayList.get(i) != 999) {
                mean += arrayList.get(i);
                counter++;
            } else {
                arrayList.remove(i);
                break;
            }
        }

        Collections.sort(arrayList);

        if (((counter) % 2) != 0)
            meadian = arrayList.get((int) (arrayList.size() / 2));
        else
            meadian = ((arrayList.get((int) (arrayList.size() / 2)) + arrayList.get((int) (arrayList.size() / 2) - 1))
                    / 2);

        System.out.println("Mean: " + (mean / (counter)) + "\nMeadian: " + meadian);

    }
}