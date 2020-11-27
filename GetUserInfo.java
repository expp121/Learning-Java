import java.util.Scanner;

public class GetUserInfo
{
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        int age;
        String name;
        System.out.print("Enter your age: ");
        age= input.nextInt();//взема число въведено от клавиатурата и го присфоява на променливата age
        input.nextLine();//Взема натиснатия Enter след въвеждането на годините
        System.out.print("Enter your name: ");
        name= input.nextLine();
        System.out.println("You are "+name+ " and you are "+age +" years old.");
        input.close();
    }
}