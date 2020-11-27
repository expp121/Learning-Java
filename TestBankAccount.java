
import java.util.Scanner;
/**
 * TestBankAccount
 */
public class TestBankAccount {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(),
        bankAccount2 = new BankAccount(),
        bankAccount3 = new BankAccount(),
        bankAccount4 = new BankAccount();

        bankAccount1 = getData();
        bankAccount2 = getData();
        bankAccount3 = getData();
        input.close();
        
        showValues(bankAccount1);
        showValues(bankAccount2);
        showValues(bankAccount3);
        showValues(bankAccount4);
    }

    public static BankAccount getData(){

        BankAccount bAccount = new BankAccount();

        System.out.print("Enter the account's number: ");
        bAccount.setAccountNumber(input.nextLine());

        System.out.print("Set the account's name: ");
        bAccount.setName(input.nextLine());

        System.out.print("Set the account's balance: ");
        bAccount.setBalance(input.nextDouble());
        input.nextLine();

        System.out.print("\n");

        return bAccount;
    }

    public static void showValues(BankAccount acc) {
        System.out.println("----------------\nAccount Number: "+ acc.getAccountNumber());
        System.out.println("Account Name: "+ acc.getName());
        System.out.println("Account Balance: "+ acc.getBalance());
        acc.deductMonthlyFee();
        acc.explainAccountPolicy();
        System.out.println("Account Balance: "+ acc.getBalance()+"\n----------------\n");
    }
}