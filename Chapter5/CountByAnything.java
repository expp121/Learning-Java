import java.util.Scanner;

class CountByAnything{

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        int number;
        System.out.print("What value to count by?: ");
        number = input.nextInt();

        for(int i = 5; i <= 200 ; i+=number) {
            if(i % 10 != 0)
                System.out.print(i + " ");
            else System.out.println(i + " \n");
        }
        input.close();
    }
}