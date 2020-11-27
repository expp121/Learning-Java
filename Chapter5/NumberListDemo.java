public class NumberListDemo {

    public static void main(String Args[]) {
        int[] number = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int sum = 0;
        float avg;
        int lowest = number[0];
        int highest = number[0];

        System.out.print("DISPLAYING THE NUMBERS\n-------------------------\n");

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
            sum += number[i];

            if (lowest > number[i])
                lowest = number[i];

            if (highest < number[i])
                highest = number[i];

        }
        System.out.println();

        System.out.println("\nDISPLAYING THE NUMBERS IN REVERSE\n-----------------------------");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[7 - i] + " ");
        }
        System.out.println();

        System.out.println("\nTHE SUM OF THE NUMBERS IS " + sum);
        System.out.println("\nDISPLAYING THE NUMBERS SMALLER THEN 5");
        for (int i = 0; i < number.length; i++) {
            if (number[i] < 5)
                System.out.print(number[i] + " ");
        }
        System.out.println("\n");

        System.out.println("THE LOWEST NUMBER IS " + lowest);

        System.out.println("THE HIGHEST NUMBER IS " + highest);

        avg = sum / number.length;
        System.out.println("THE AVERAGE IS " + avg);

        System.out.println("DISPLAYING THE NUMBERS HIGHER THAN THE AVERAGE");
        for (int i = 0; i < number.length; i++) {
            if (avg < number[i])
                System.out.print(number[i] + " ");
        }
        System.out.println();
    }
}