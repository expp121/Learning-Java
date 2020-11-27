import java.util.Arrays;

public class SortStrings {

    public static void main(String Args[]) {

        String[] arr = { "Koqj", "Nuka", "Morf", "Loope", "Nuke", "Worel", "Sfam", "Peolc", "Joka", "Vaeo" };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}