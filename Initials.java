import java.util.Scanner;

public class Initials
{
    public static void maint(String[] args) {
        char init1,init2,init3;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your first initial: "); init1=input.nextChar();
        System.out.print("Enter your second initial: ");init2=input.next();
        System.out.print("Enter your third initial: ");init3=input.next();
        System.out.println(init1+"."+init2+"."+init3);
        input.close();
    }
}